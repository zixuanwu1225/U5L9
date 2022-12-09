public class LogMessage {
    private String machineID;
    private String description;

    public LogMessage(String message){
        machineID = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }

    public boolean containsWord(String keyword){
        if (description.indexOf(keyword) == -1) return false;
        int index = description.indexOf(keyword);
        int indexTemp = index--;
        if (!description.substring(indexTemp,indexTemp+1).equals(" ")) return false;
        
    }

    public String getMachineID() {
        return machineID;
    }

    public String getDescription() {
        return description;
    }
}
