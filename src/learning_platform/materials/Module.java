package learning_platform.materials;

public class Module {

    private String moduleName;

    public Module(String name) {
        this.moduleName = name;
    }

    public String getModuleName() { return moduleName; }
    public void setModuleName(String name) { this.moduleName = name; }
}
