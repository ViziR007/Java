package com.company;

import java.io.*;

public class SerializationUtil implements Serializable {
    public void Serialize(Game object)
    {
        // Saving of object in a file
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("Game.jsf");

            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Game Deserialize() throws Exception
    {
        Game game;
        // Reading the object from a file
        try {
            FileInputStream file = new FileInputStream
                    ("Game.jsf");
            ObjectInputStream in = new ObjectInputStream
                    (file);

            // Method for deserialization of object
            game = (Game) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            return game;
        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception("Deserialization failed");
        }

    }
}