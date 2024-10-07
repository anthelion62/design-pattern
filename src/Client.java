class Client {
    public static void main(String args[]) {
        AbstractFile appleJpg;
        AbstractFile bananaGif;
        AbstractFile chemistry;
        AbstractFile mathematics;
        AbstractFile documents;
        Folder images;
        AbstractFile text;

        documents = new Folder("資料");
        images = new Folder("画像");
        text = new Folder("テキスト");

        appleJpg = new ImageFile("Apple.jpg");
        bananaGif = new ImageFile("Banana.gif");
        chemistry = new TextFile("化学.txt");
        mathematics = new TextFile("数学.doc");

        images.add(appleJpg);
        images.add(bananaGif);
        text.add(chemistry);
        text.add(mathematics);
        documents.add(images);
        documents.add(text);

        //ウイルススキャンを行う
        documents.killVirus();
    }
}  