package Library;

    public class Books {
String title;
public Books (String title) {
this.title = title;
}
public static void main(String[] args) {
Authors[]authorArray = {new Authors(),
new Authors(),
new Authors(),
};
System.out.println(authorArray[0].getAuthors()[0]);
System.out.println(authorArray[0].getAuthors()[1]);
String test []={"Dostoevski", "Bulgakov","V.Grimm","J.Grimm"};
authorArray[1].setAuthors(test);
System.out.println(authorArray[1].getAuthors()[0]);
System.out.println(authorArray[1].getAuthors()[1]);
System.out.println(authorArray[1].getAuthors()[2]);
System.out.println(authorArray[1].getAuthors()[3]);
Books book = new Books("Мцыри");
String [] books = new String[5];
books[0] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[0];
book.title = "Онегин";
books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
book.title = "Идиот";
books[2] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[0];
book.title = "Мастер и Маргарита";
books[3] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[1];
book.title = "Сказки братьев Гримм";
books[4] = "Title book: " + book.title + " authors: " + authorArray[1].getAuthors()[2] + ", " +authorArray[1].getAuthors()[3];
for(String x: books){
System.out.println(x);
}
}
public String toString(){
return title;
}
}
