import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("contraband");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("memories");
        DBHelper.save(folder2);

        File file1 = new File("powdered-pasta", ".png", 45, folder1);
        DBHelper.save(file1);
        File file2 = new File("cowboy-boots", ".txt", 250, folder1);
        DBHelper.save(file2);
        File file3 = new File("the-rapture", ".jpg", 45, folder2);
        DBHelper.save(file3);
        File file4 = new File("stew-making-competition", ".wav", 1, folder2);
        DBHelper.save(file4);

    }
}
