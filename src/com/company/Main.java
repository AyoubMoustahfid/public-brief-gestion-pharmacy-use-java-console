package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        ArrayList<Client> clients = new ArrayList<Client>();

        Scanner scanner = new Scanner(System.in);

        boolean var = true;

        while (var){
            /*  Depart de la gestion les programme
            * ------- Menu Principal ------
            * --->>> la gestion Medicament
            * --->>> la gestion Book
            * */

            System.out.println("======= Mednu de les gestion programmes =======");
            System.out.println("(1) Gestion medicament");
            System.out.println("(2) gestion Client");

            int choix = scanner.nextInt();

            switch (choix){
                case 1 :
                    boolean variable1 = true;
                    while(variable1){
                        // Gestion Medicament
                        // Method CRUD(ADD, UPDATE, DELETE)
                        // Search Any product in medicaments

                        System.out.println("CHoix :");

                        int choixPharmacien = scanner.nextInt();
                        switch (choixPharmacien){
                            case 1:
                                System.out.println("add id product: \n");
                                int id = medicaments.size() + 1;

                                System.out.println("add name Product: \n");
                                String nameProduct = scanner.nextLine();

                                System.out.println("add description Product: \n");
                                String descriptionProduct = scanner.next();

                                System.out.println("Add price product: \n");
                                int price = scanner.nextInt();
                                System.out.println("DH");

                                Medicament medicament = new Medicament(id, nameProduct, descriptionProduct, price);
                                medicaments.add(medicament);

                                System.out.println("add medicament Product Succesfuly");

                                break;

                            case 2:
                                System.out.println("Medicament deleted !!");

                                for(int i = 0; i < medicaments .size(); i++){
                                    System.out.format("%10s %10s %10s", i + 1,
                                            medicaments.get(i).getId(),
                                            medicaments.get(i).getNameProduct(),
                                            medicaments.get(i).getDescriptionProduct(),
                                            medicaments.get(i).getPrice());
                                    System.out.println();
                                }

                                System.out.println("--------------------------------------------------");
                                System.out.println("Select medicament to delete !!");
                                medicaments.remove(scanner.nextInt() - 1);
                                System.out.println("Product Deleted !!");

                                break;

                            case 3:
                                System.out.println("Update Medicament");
                                System.out.println("---------------------------------------------------");

                                for(int i = 0; i < medicaments.size(); i++){
                                    System.out.format("%10s %10s %10s", i + 1,
                                            medicaments.get(i).getId(),
                                            medicaments.get(i).getNameProduct(),
                                            medicaments.get(i).getDescriptionProduct(),
                                            medicaments.get(i).getPrice());
                                }

                                System.out.println("----------------------------------------------------");
                                System.out.println("Select medicament to update");

                                int ii = scanner.nextInt() - 1;

                                for(int i = 0; i < medicaments.size(); i++ ){
                                    if(i == ii){

                                        System.out.println("new Name the Product :");
                                        String newName  = scanner.nextLine();
                                        medicaments.get(i).setNameProduct(newName);

                                        System.out.println("new Description the product :");
                                        String newDescription = scanner.nextLine();
                                        medicaments.get(i).setDescriptionProduct(newDescription);

                                        System.out.println("new Price the product :");
                                        int newPrice = scanner.nextInt();
                                        medicaments.get(i).setPrice(newPrice);

                                        System.out.println("Product Updated");
                                    }else{
                                        System.out.println("no id is associated try again more");
                                    }
                                }
                                System.out.println("Update successfly");
                                break;

                            case 4:
                                System.out.println("Show Mediacament");
                                System.out.println("------------------------------------------------------");

                                for(int i = 0; i < medicaments.size(); i++){
                                    System.out.format("%10s %10s %10s", i + 1,
                                            medicaments.get(i).getId(),
                                            medicaments.get(i).getNameProduct(),
                                            medicaments.get(i).getDescriptionProduct(),
                                            medicaments.get(i).getPrice());
                                }

                                System.out.println("------------------------------------------------------");

                                break;

                            case 5:
                                System.out.println("End");
                                variable1 = false;
                                var = true;
                                break;

                            default:
                                System.out.println("CHoix invalid !!!!");
                                break;
                        }
                    }
                break;

                case 2:
                    boolean variable2 = true;

                    while(variable2){
                        // Gestion Client
                        // ADD Client
                        // if client fedéle else not fedéle


                        System.out.println("Choix :");
                        int choixClient = scanner.nextInt();
                        switch (choixClient){
                            case 1:
                                System.out.println("add ID Client : \n");
                                int id = clients.size() + 1;

                                System.out.println("add firstname Client: \n");
                                String firstname = scanner.next();

                                System.out.println("add lastname Client: \n");
                                String lastname = scanner.next();

                                System.out.println("add phone CLient: \n");
                                int phone = scanner.nextInt();

                                System.out.println("add email Client: \n");
                                String email = scanner.next();

                                System.out.println("Ajouté Some Vente Client : \n");
                                int someVente = scanner.nextInt();


                                Client client = new Client(id, firstname, lastname, phone, email, someVente);
                                clients.add(client);

                               if((phone >= 10)){
                                   System.out.println("Add Client");
                               }else{
                                   System.out.println("error in length number the phone ");
                               }

                                if(someVente >= 3){
                                    System.out.println("cette person une client fedéle :) :)");
                                }else{
                                    System.out.println("cette person n' a pas une client fedéle ");
                                }


                                break;

                            case 2:
                                System.out.println("Delete Employer");
                                System.out.println("----------------------------------------------");
                                System.out.println();
                                System.out.println("----------------------------------------------");

                                for(int i = 0; i < clients.size(); i++){
                                    System.out.format("%10s %10s %10s", i + 1,
                                            clients.get(i).getId(),
                                            clients.get(i).getFirstname(),
                                            clients.get(i).getLastname(),
                                            clients.get(i).getPhone(),
                                            clients.get(i).getEmail(),
                                            clients.get(i).getSomeVente());
                                    System.out.println();
                                }
                                System.out.println("-----------------------------------------------");

                                System.out.println("select client to deleted !!");
                                System.out.println("Are you sure ???");
                                int delete = scanner.nextInt();
                                switch (delete){
                                    case 1:
                                        clients.remove(scanner.nextInt() - 1);
                                        System.out.println("deletes succussfly");
                                        break;

                                    default:
                                        System.out.println("Not Sure");
                                        break;
                                }
                                System.out.println("deletes succussfly");

                                break;

                            case 3:
                                System.out.println("End Crud");
                                variable2 = false;
                                var = true;
                                break;

                        }

                    }
                    break;

                case 3:
                    System.out.println("=+++++++++++  END ================");
                    System.out.println(0);
                    break;

                default:
                    System.out.println("Choix invalid !!!!!!");
                    break;
            }
        }

    }
}
