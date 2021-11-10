package ch.heigvd.api;

public class MailRobot {
    public static void main(String[] args) {
        System.out.println("Hello World from SMTP Lab!");
        
        // TODO
        
        // 1. Get configuration data
        // Lire fichier properties: https://crunchify.com/java-properties-file-how-to-read-config-properties-values-in-java/
        /*
        Classes:
            - ConfigurationManager
         */
        
        // 2. Implement application-specific business logic
        /*
        Classes:
            - Prank
            - PrankGenerator (utilise ConfigurationManager)
            - Person
            - Group (Person[])
            - Mail (from, to, subject, body)
         */
        
        // 3. Implement SMTP protocol and send e-mail messages
        // Socket API, on s'annonce au serveur
        /*
        Classes:
            - SmtpClient
                void sendMail(Mail m);
         */
        
    }
}