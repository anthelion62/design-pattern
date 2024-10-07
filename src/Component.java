import java.util.*;

//Abstract File：Component
abstract class AbstractFile {
    void killVirus(){
        throw new UnsupportedOperationException();
    };
    void add(AbstractFile abstractFile) {
        throw new UnsupportedOperationException();
    };
    void remove(AbstractFile abstractFile) {
        throw new UnsupportedOperationException();
    }
    AbstractFile getChild(int index) {
        throw new UnsupportedOperationException();
    }
}

//Image File：Leaf
class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    //ウイルススキャン
    @Override
    void killVirus() {
        System.out.println("画像ファイル'" + name + "'に対してウイルススキャンを行う");
    }
}

//Text：Leaf
class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    //ウイルススキャン
    public void killVirus() {
        System.out.println("----テキストファイル'" + name + "'に対してウイルススキャンを行う");
    }
}

//Fold：Composite
class Folder extends AbstractFile {
    //fileList：子要素をリストとして保持している
    private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    //木構造管理のための処理
    @Override
    void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    //ノードが担当する処理
    public void killVirus() {
        System.out.println("****フォルダ'" + name + "'に対してウイルススキャンを行う");
        Iterator iterator = fileList.iterator();
        //メンバのkillVirus()メソッドを行う
        while(iterator.hasNext()) {
            AbstractFile abstractFile = (AbstractFile) iterator.next();
            abstractFile.killVirus();
        }
    }
}