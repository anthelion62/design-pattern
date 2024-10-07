import java.util.*;

//画像ファイル
class ImageFileBefore {
    private String name;

    public ImageFileBefore(String name) {
        this.name = name;}

    //画像ファイルに対してウイルススキャンを行う
    public void killVirus() {
        System.out.println("----画像ファイル'" + name + "'に対してウイルススキャンを行う");
    }
}

//テキストファイル
class TextFileBefore {
    private String name;

    //テキストファイル
    public TextFileBefore(String name) {
        this.name = name;
    }

    //テキストファイルに対してウイルススキャンを行う
    public void killVirus() {
        System.out.println("----テキストファイル'" + name + "'に対してウイルススキャンを行う");
    }
}

//フォルダ
class FolderBefore {
    private String name;
    //folderList
    private ArrayList<FolderBefore> folderList = new ArrayList<FolderBefore>();
    //imageList
    private ArrayList<ImageFileBefore> imageList = new ArrayList<ImageFileBefore>();
    //textList
    private ArrayList<TextFileBefore> textList = new ArrayList<TextFileBefore>();

    public FolderBefore(String name) {
        this.name = name;
    }

    //addFolder
    public void addFolder(FolderBefore f) {
        folderList.add(f);
    }

    //addImageFile
    public void addImageFile(ImageFileBefore image) {
        imageList.add(image);
    }

    //addTextFile
    public void addTextFile(TextFileBefore text) {
        textList.add(text);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒"); //模拟杀毒

        // 対象がフォルダであれば，FolderのkillVirus()メソッドを実行する
        for(Object obj : folderList) {
            ((FolderBefore)obj).killVirus();
        }

        // 対象が画像であれば，ImageFileのkillVirus()メソッドを実行する
        for(Object obj : imageList) {
            ((ImageFileBefore)obj).killVirus();
        }

        // 対象がテキストであれば，TextFileのkillVirus()メソッドを実行する
        for(Object obj : textList) {
            ((TextFileBefore)obj).killVirus();
        }
    }
}