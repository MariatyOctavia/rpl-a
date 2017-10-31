/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author user
 */
public class ImageFilter extends FileFilter {

    public boolean accept(File f) {
    if (f.isDirectory()) {
        return true;
    }

    String extension = ExtensionUtils.getExtension(f);
    if (extension != null) {
        if (extension.equals(ExtensionUtils.jpeg) ||
            extension.equals(ExtensionUtils.jpg) ||
            extension.equals(ExtensionUtils.png)) {
                return true;
        } else {
            return false;
        }
    }

    return false;
}
    @Override
    public String getDescription() {
        return "Image only";
    }
    
}
