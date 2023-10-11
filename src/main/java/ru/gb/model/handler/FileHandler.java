package ru.gb.model.handler;

        import java.io.*;

public class FileHandler implements Saveble, Loadable {

    public void save(String path, Serializable serializable) throws IOException {
        try (ObjectOutputStream saveStream = new ObjectOutputStream(new FileOutputStream(path))) {
            saveStream.writeObject(serializable);
        } catch (FileNotFoundException e) {
            System.out.println("Не удается сохранить файл");
        } catch (Exception e) {
            throw new IOException("Не удалось сохранить данные\n"+e.getMessage());
        }
    }


    public Object load(String path) throws IOException{
        try (ObjectInputStream loadStream = new ObjectInputStream(new FileInputStream(path))) {
            return loadStream.readObject();
        } catch (Exception e) {
            throw new IOException("Не удалось загрузить данные по пути "+e.getMessage());
//            return null;
        }

    }
}


