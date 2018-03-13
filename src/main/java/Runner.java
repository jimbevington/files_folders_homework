import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Boris Berezovsky", "baz123");
        DBHelper.save(owner1);
        Owner owner2 = new Owner("Mikael Khordokovsky", "kdog67");
        DBHelper.save(owner2);

        Folder folder1 = new Folder("contraband", owner1);
        DBHelper.save(folder1);
        Folder folder2 = new Folder("memories", owner2);
        DBHelper.save(folder2);

        File file1 = new File("powdered-pasta", ".png", 45, folder1);
        DBHelper.save(file1);
        File file2 = new File("cowboy-boots", ".txt", 250, folder1);
        DBHelper.save(file2);
        File file3 = new File("the-rapture", ".jpg", 45, folder2);
        DBHelper.save(file3);
        File file4 = new File("stew-making-competition", ".wav", 1, folder2);
        DBHelper.save(file4);

        file1.setName("dried-donuts");
        DBHelper.update(file1);

        DBHelper.delete(file4);

        File foundFile = DBHelper.findById(File.class, file1.getId());

        List<File> filesFromFolder = DBHelper.getFilesByFolder(folder1);

        List<File> allFiles = DBHelper.getAll(File.class);
        List<Folder> allFolders = DBHelper.getAll(Folder.class);
        List<Owner> allOwners = DBHelper.getAll(Owner.class);

        List<Folder> foldersFromOwner = DBHelper.getFoldersByOwner(owner1);

    }
}
