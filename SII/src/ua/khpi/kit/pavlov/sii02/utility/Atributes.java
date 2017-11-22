/**
 * @file AtributeLoader.java
 *
 * @author JR_Rider
 * @date 22 но€б. 2017 г.
 */
package ua.khpi.kit.pavlov.sii02.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author JR_Rider
 *
 */
public class Atributes {

	static HashMap<String, String> atributeTypes;
	private HashMap<String, String> atributes;
	public HashMap<String, String> getAtributes() {
		return atributes;
	}

	public void setAtributes(HashMap<String, String> atributes) {
		this.atributes = atributes;
	}

	private File fileFromLoad;
	private String name;

	Atributes(String name) {
		atributeTypes = new HashMap<>();
		atributes = new HashMap<>();
		this.name = name;
		loadFileData(name);

	}

	private void loadFileData(String fileName) {
		fileFromLoad = new File(fileName);

		try {
			Scanner sc = new Scanner(fileFromLoad);

			while (sc.hasNextLine()) {
				String[] atribute = sc.nextLine().split(" ");

				String type = atribute[0];
				String name = atribute[1];
				String value = atribute[2];

				if (!atributeTypes.containsKey(name))
					atributeTypes.put(name, type);
				this.atributes.put(name, value);

			}
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
