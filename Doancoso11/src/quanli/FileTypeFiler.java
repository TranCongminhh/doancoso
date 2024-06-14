package quanli;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileTypeFiler extends FileFilter {
public final String extension2;
public final String dessciption2;

	public FileTypeFiler(String extension2, String dessciption2) {
		this.extension2 = extension2;
		this.dessciption2 = dessciption2;
}
	@Override
	public boolean accept(File f) {
		if(f.isDirectory())
		{
			return true;
		}
		return f.getName().endsWith(extension2);
	}

	@Override
	public String getDescription() {
		return dessciption2 + String.format("(*%s)", extension2);
	}

}
