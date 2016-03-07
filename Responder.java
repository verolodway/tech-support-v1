import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
    private HashMap<String, String> respuestaAuto;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        respuestaAuto = new HashMap<>();
        respuesta = new ArrayList<>(Arrays.asList(
                    "Declare más detalladamente su problema.", 
                    "Repita la pregunta por favor.",
                    "Lo siento, no podemos ayudarle.",
                    "Consulte con un profesional personalmente en la empresa.",
                    "Su problema no se corresponde con nuestros servicios."));
        respuestaAuto.put("hola","Hola, informenos de su problema.");
        respuestaAuto.put("problema","¿De que tipo de problema se trata?");
        respuestaAuto.put("tecnico","Contacte con nuestro servidor telefónico: 666666666");
        respuestaAuto.put("servicio","No disponemos de más servicios.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String respuest;
        if(respuestaAuto.get(input) != null){
            respuest = respuestaAuto.get(input);
        }
        else{
            respuest = respuesta.get(rnd.nextInt(respuesta.size()));
        }
        return respuest;
    }
}
