import jdk.internal.util.xml.impl.Input;

import java.net.*;
import java.io.*;
public class UrlProgram {
    public static void main(String[] args) throws Exception {
        URL theURL = new URL("http://www.inifiniteskilss.com");
        System.out.println("basic information");
        System.out.println();
        System.out.println("Protocol:" + theURL.getProtocol());
        System.out.println("port:" + theURL.getPort());
        System.out.println("Host:" + theURL.getHost());
        URLConnection theconn = theURL.openConnection();
        //check to seeif there is content
        int contentLen = theconn.getContentLength();
        int c;
        if (contentLen != 0) {
            System.out.println("content");
            System.out.println();
            InputStream urlInput = theconn.getInputStream();
            while (((c = urlInput.read()) != -1)) {
                System.out.println((char) c);
            }
            urlInput.close();
        } else {
            System.out.println("sorry no content");

        }
    }
}