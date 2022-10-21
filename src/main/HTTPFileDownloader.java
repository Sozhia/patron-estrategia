package main;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
  Ejemplo básico de código de descarga de contenido desde una URL
 */

public class HTTPFileDownloader {
    static private int BUFFER_SIZE = 1024;

    /*
    Solo hemos implementado métodos estáticos, por lo que no es necesario que se instancie nunca un objeto
    de la clase HTTPFileDownloader
     */
    private HTTPFileDownloader() {}

    /*
    downloadFromURL crea una URL desde el enlace link, crea un stream de datos y lo almacena como String para
    su posterior manipulación
     */
    public static String downloadFromURL(String link) {
        String myURLContent = "";
        try {
            // Abrir enlace URL como stream de datos
            BufferedInputStream in = new BufferedInputStream(new URL(link).openStream());
            int bytesRead = 0;
            byte[] byteContents = new byte[BUFFER_SIZE];
            // Lectura de contenido
            while((bytesRead = in.read(byteContents)) != -1) {
                // Transformación de contenido a String
                myURLContent += new String(byteContents, 0, bytesRead);
            }

            return myURLContent;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.err.println("There is a malformed URL in " + HTTPFileDownloader.class.getClass() );
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("There is an IO error for the Stream opened in " + HTTPFileDownloader.class.getClass());
            System.exit(1);
        }
        // No deberíamos llegar aquí, ya que si el try no termina correctamente terminaremos la ejecución
        // con los System.Exit();
        return "I AM NOT SUPPOSED TO ARRIVE HERE";
    }
}
