package petep;

import com.warxim.petep.extension.Extension;
import com.warxim.petep.helper.ExtensionHelper;
import com.warxim.petep.helper.GuiHelper;

import java.util.logging.Logger;

/**
 * PETEP extension template
 */
public class PetepExtension extends Extension {
    public PetepExtension(String path) {
        super(path);
    }

    @Override
    public String getCode() {
        return "extension-template";
    }

    @Override
    public String getName() {
        return "Extension template";
    }

    @Override
    public String getDescription() {
        return "Extension template for developers.";
    }

    @Override
    public String getVersion() {
        return "0.0.42";
    }

    @Override
    public void beforeInit(ExtensionHelper helper) {
        // Register taggers, modifiers, receivers, listeners...
    }

    @Override
    public void init(ExtensionHelper helper) {
        // Register proxy module factories and interceptor module factories
        Logger.getGlobal().info("Extension template loaded!");
    }

    @Override
    public void afterInit(ExtensionHelper helper) {
        // Do something...
    }

    @Override
    public void initGui(GuiHelper helper) {
        // Register app tabs, register guides
        Logger.getGlobal().info("Extension template GUI loaded!");
    }

    @Override
    public void beforeInitGui(GuiHelper helper) {
        // Do something...
    }

    @Override
    public void afterInitGui(GuiHelper helper) {
        // Do something...
    }

    @Override
    public void destroy() {
        // Handle extension destroy (PETEP shutting down)
    }

}
