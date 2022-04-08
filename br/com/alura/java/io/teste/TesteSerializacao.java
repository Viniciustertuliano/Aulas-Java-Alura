package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Cliente;

public class TesteSerializacao{
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Cliente cliente = new Cliente();
        cliente.setNome("vinicius");
        cliente.setCpf("13216546");
        cliente.setProfissao("dev");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getProfissao());

    }
}