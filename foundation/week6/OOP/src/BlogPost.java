/*
Create a BlogPost class that has
an authorName
a title
a text
a publicationDate
Create a few blog post objects:
"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
Lorem ipsum dolor sit amet.
"Wait but why" titled by Tim Urban posted at "2010.10.10."
A popular long-form, stick-figure-illustrated blog about almost everything.
"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture
outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.
 */

public class BlogPost {
    String anAuthorName;
    String aTitle;
    String aText;
    String aPublicationDate;

    public void postObj() {
        System.out.println(anAuthorName + aTitle + aText + aPublicationDate);
    }

}

class BlogPost1 {
    public static void main(String[] srgs) {
        BlogPost Blogpost1;
        Blogpost1 = new BlogPost();
        Blogpost1.anAuthorName = "John Doe";
        Blogpost1.aTitle = "Lorem Ipsum";
        Blogpost1.aText = "Lorem ipsum dolor sit amet.";
        Blogpost1.aPublicationDate = "2000.05.04.";
        Blogpost1.postObj();

    }

    static class BlogPost2 {
        public static void main(String[] srgs) {
            BlogPost Blogpost2;
            Blogpost2 = new BlogPost();
            Blogpost2.anAuthorName = "Tim Urban";
            Blogpost2.aTitle = "Wait but why";
            Blogpost2.aText = "A popular long-form, stick-figure-illustrated blog about almost everything.";
            Blogpost2.aPublicationDate = "2010.10.10.";
            Blogpost2.postObj();

        }


    }

    static class BlogPost3 {
        public static void main(String[] srgs) {
            BlogPost BlogPost3;
            BlogPost3 = new BlogPost();
            BlogPost3.anAuthorName = "Tim Urban";
            BlogPost3.aTitle = "Wait but why";
            BlogPost3.aText = "A popular long-form, stick-figure-illustrated blog about almost everything.";
            BlogPost3.aPublicationDate = "2010.10.10.";
            BlogPost3.postObj();

        }

    }
}
