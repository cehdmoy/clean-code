package cl.cehd.cleancode.examples;

public class MethosExamples {

    //Do Only one thing and do it well
    boolean erros(String req, String response) {
        if (req.equalsIgnoreCase("ERROR")) {
            response = "Response has erros";
            return true;
        } else {
            response = "we are happy, and U";
            return false;
        }
    }

    //Warning!! Flags
    void manageClient(boolean isNewClient, String client) {
        if (isNewClient)
            insertNewClient(client);
        else {
            System.out.printf("No es nuevo cliente");
            logClientForMetricPurpose(client);
        }
    }

    //Primitive obsession
    boolean validateUser(String urs, String pass, String type) {
        if (type.equalsIgnoreCase("anonimus")) {
            System.out.printf("User: " + urs);
            return true;
        } else {
            if (urs.equalsIgnoreCase("roberto") && pass.equals("123MomiaEs"))
                return true;
        }
        return false;
    }

    boolean validateUser(User user) {
        if (user.type.equalsIgnoreCase("anonimus")) {
            System.out.printf("User: " + user.urs);
            return true;
        } else {
            if (user.urs.equalsIgnoreCase("roberto") && user.pass.equals("123MomiaEs"))
                return true;
        }
        return false;
    }
    //How many lines


    class User {
        String urs;
        String pass;
        String type;
    }


    private void logClientForMetricPurpose(String client) {

    }

    private void insertNewClient(String client) {

    }


}
