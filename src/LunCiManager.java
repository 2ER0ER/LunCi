import java.util.List;

public  class LunCiManager {
    private List<String> markDownFiles;
    private String markDownDir;
    private String htmlTargetDir;
    private LunCiManager(String[] args) {
        this.markDownFiles = null;
        this.markDownDir = " ";
        this.htmlTargetDir = " ";
    }
    public static void initMarkDownInfo(String[] args){

    }
    private void typeof(String[] args){
        for(String arg :args){
            if(arg.endsWith(".md")) {
                this.markDownFiles.add(arg);
            }
        }
    }
}
