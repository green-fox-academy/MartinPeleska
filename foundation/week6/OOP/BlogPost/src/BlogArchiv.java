public class BlogArchiv {

    public static void main(String[] args){

        BlogPost1 blog1;

        blog1 = new BlogPost1();
        blog1.aTitle = "Lorem Ipsum ";
        blog1.aAuthorName = "John Doe ";
        blog1.aText = "Lorem ipsum dolor sit amet. ";
        blog1.aPublicationDate = "2000.05.04. ";

        blog1.print();


        BlogPost1 blog2;

        blog2 = new BlogPost1();
        blog2.aTitle = "Wait but why ";
        blog2.aAuthorName = "Tim Urban ";
        blog2.aText = "A popular long-form, stick-figure-illustrated blog about almost everything." ;
        blog2.aPublicationDate = "2010.10.10." ;

        blog2.print();


        BlogPost1 blog3;

        blog3 = new BlogPost1();
        blog3.aTitle = "One Engineer Is Trying to Get IBM to Reckon With Trump ";
        blog3.aAuthorName = "William Turton ";
        blog3.aText = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture\n" +
                "outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing." ;
        blog3.aPublicationDate = "2017.03.28. " ;

        blog3.print();

    }

}

