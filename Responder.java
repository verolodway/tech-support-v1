import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    //Atributo que nos ayudará a escoger una respuesta aleatoria.
    private Random rnd;
    //ArrayList que nos permitirá escoger entre varias respuestas.
    private ArrayList<String> respuesta;
    //String que nos genera la respuesta.
    private String resp;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        respuesta = new ArrayList<>(Arrays.asList(
                    "Declare más detalladamente su problema.", 
                    "Repita la pregunta por favor.",
                    "Lo siento, no podemos ayudarle.",
                    "Consulte con un profesional personalmente en la empresa.",
                    "Su problema no se corresponde con nuestros servicios."));
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return resp = respuesta.get(rnd.nextInt(respuesta.size()));
    }
}
