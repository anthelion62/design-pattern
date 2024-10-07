class ClientBefore {
    public static void main(String args[]) {
        FolderBefore folder1,folder2,folder3;
        folder1 = new FolderBefore("資料");
        folder2 = new FolderBefore("画像ファイル");
        folder3 = new FolderBefore("テキストファイル");

        ImageFileBefore image1,image2;
        image1 = new ImageFileBefore("apple.jpg");
        image2 = new ImageFileBefore("orange.gif");

        TextFileBefore text1,text2;
        text1 = new TextFileBefore("国語.txt");
        text2 = new TextFileBefore("数学.doc");

        folder2.addImageFile(image1);
        folder2.addImageFile(image2);
        folder3.addTextFile(text1);
        folder3.addTextFile(text2);
        folder1.addFolder(folder2);
        folder1.addFolder(folder3);

        folder1.killVirus();
    }
}
