package by.belhard.j22.lessons.lesson09.warehouseExample.repository;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;
import by.belhard.j22.lessons.lesson09.warehouseExample.storage.GoodStorage;

import java.io.*;
import java.util.Collection;
import java.util.Optional;

public class GoodRepositoryImpl implements GoodRepository {

    private static final String LOAD_DATA_ERROR_MESSAGE = "Can not load data from file storage";

    private final GoodStorage storage = new GoodStorage();

    @Override
    public Collection<GoodEntity> getAllGoods() {

        return storage.getAll();
    }

    @Override
    public void loadData() {

        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(GoodStorage.STORAGE_FILE_PATH))) {

            reader.readLine();

            while (reader.ready()) {
                storage.addToStorage(parseGoodEntityFromLine(reader.readLine()));
            }

        } catch (IOException e) {
            throw new RuntimeException(LOAD_DATA_ERROR_MESSAGE);
        }
    }

    public void saveData() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(GoodStorage.STORAGE_FILE_PATH))) {

            writer.write(String.format(GoodEntity.GOODS_TABLE_FORMAT, "NAME", "QUANTITY"));

            storage.forEachGood(g -> {
                try {
                    writer.write(g.formatForPrint());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(LOAD_DATA_ERROR_MESSAGE);
        }
    }

    @Override
    public void changeGoodQuantity(String goodName, int quantity) {

        Optional<GoodEntity> optional = storage.getGoodByName(goodName);
        if (quantity < 0 && optional.isPresent()) {
            GoodEntity good = optional.get();
            if (good.getQuantity() < -quantity)
                storage.addToStorage(new GoodEntity(goodName, -good.getQuantity()));
        } else
            storage.addToStorage(new GoodEntity(goodName, quantity));
    }

    @Override
    public boolean containsGood(String goodName) {

        return storage.containsGood(goodName);
    }

    @Override
    public GoodEntity getGoodByName(String name) {

        return storage.getGoodByName(name).orElseThrow(NoEntityFoundException::new);
    }

    private GoodEntity parseGoodEntityFromLine(String line) {

        line = line.replaceAll("\\s*", "");

        String[] split = line.split("\\|");

        return new GoodEntity(split[0], Integer.parseInt(split[1]));
    }
}
