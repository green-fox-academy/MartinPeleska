/*Create a PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"

 */
import java.awt.*;


//import static com.sun.tools.jdeps.ModuleDotGraph.Attributes.BLUE;
//import static com.sun.tools.jdeps.ModuleDotGraph.Attributes.ORANGE;

public class PostIt {
    String backgroundColor;
    String textOnIt;
    String textColor;

    public void postObj (){
        System.out.println(backgroundColor + textOnIt + textColor);
    }
}

class orangeWithBlue {
    public static void main(String[] args) {
        PostIt orangeWithBlueObj;
        orangeWithBlueObj = new PostIt();
        orangeWithBlueObj.backgroundColor = "orange";
        orangeWithBlueObj.textOnIt = "  Idea 1  ";
        orangeWithBlueObj.textColor = "blue";
        orangeWithBlueObj.postObj();
    }
}

    class pinkWithBlack {
        public static void main(String[] args) {
            PostIt pinkWithBlack;
            pinkWithBlack = new PostIt();
            pinkWithBlack.backgroundColor = "pink";
            pinkWithBlack.textOnIt = "  Awesome  ";
            pinkWithBlack.textColor = "black";
            pinkWithBlack.postObj();
        }
    }

        class yellowWithGreen {
            public  static void main(String[] args) {
                PostIt yellowWithGreen;
                yellowWithGreen = new PostIt();
                yellowWithGreen.backgroundColor = "pink";
                yellowWithGreen.textOnIt = "  Superb!  ";
                yellowWithGreen.textColor = "black";
                yellowWithGreen.postObj();
            }

        }

