package ui;
import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import exception.ClientNoFoundException;
import model.Client;
import model.Order;
import model.OrderSystem;
import model.Product;
import model.Restaurant;
import model.RestaurantSort;

public class Menu {

	private static Scanner sc;
	private OrderSystem model;

	public Menu() {
		this.model = new OrderSystem();
		sc = new Scanner(System.in);
	}

	public OrderSystem getModel() {
		return model;
	}

	public void initialize() {
		Restaurant r1 = new Restaurant("KFC", "61543", "Sebastian");
		Restaurant r2 = new Restaurant("Rey Burguer", "37356", "Pepe");
		Restaurant r3 = new Restaurant("Mc", "272645", "Juan");
		model.addRestaurant(r1);
		model.addRestaurant(r2);
		model.addRestaurant(r3);
				
		Client c1 = new Client("1", "26", "pepe", "sdvav", 300, "5528 Roth Plaza");
		Client c2 = new Client("4", "14", "Juan", "sdvav", 700, "2 New Castle Drive");
		Client c3 = new Client("5", "16", "Carolina", "sdvav", 500, "766 Hanover Circle");
		Client c4 = new Client("2", "34", "Maria", "sdvav", 200, "85040 Shopko Alley");		
		model.addClient(c1);
		model.addClient(c2);
		model.addClient(c3);
		model.addClient(c4);
		
		Product p1 = new Product("247", "Gaseosa", "rica gaseosa", "61543", 2000);
		Product p2 = new Product("265", "Papas", "gngsfbgsfbs", "61543", 2500);
		Product p3 = new Product("458", "Helado", "snsfv  nys", "61543", 1000);
		Product p4 = new Product("236", "Salchipapa", "s sfg ej et", "61543", 20000);
		Product p5 = new Product("498", "Picada", "byvstrvs", "61543", 35000);
		model.addProduct(p1);
		model.addProduct(p2);
		model.addProduct(p3);
		model.addProduct(p4);
		model.addProduct(p5);
		
		Date date = new Date();
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p1);
		list.add(p4);
		Order o1 = new Order(1, 11, date, "3255", "8544",list  );
		Order o2 = new Order(2, 22, date, "6544", "2677",list  );
		Order o3 = new Order(3, 33, date, "8743", "2567",list  );
		model.addOrder(o1);
		model.addOrder(o2);
		model.addOrder(o3);
		
	}
	
	public void menu() {
		System.out.println("=============MENU============= ");
		System.out.println("Digita el numero que corresponda con la opcion que deseas desarrollar");
		System.out.println("0) Salir");
		System.out.println("1) Mostar clientes");
		System.out.println("2) Mostrar restaurantes");
		System.out.println("3) Mostrat productos");
		System.out.println("4) Mostrar ordenes");
		System.out.println("5) Actualizar cliente");
		System.out.println("6) Actualizar restaurante");
		System.out.println("7) Actualizar producto");
		System.out.println("8) Actualizar orden");
		System.out.println("9) Agregar cliente");
		System.out.println("10) Agregar restaurante ");
		System.out.println("11) Agregar producto");
		System.out.println("12) Agregar orden");
		System.out.println("13) Buscar cliente");
		System.out.println("14) Importar clientes");
		System.out.println("15) Importar Productos");
		System.out.println("16) Importar Restaurantes");
		System.out.println("17) Exportar Archico CSV");

	}

	public String showClients() {
		String str = "";
		ArrayList<Client> data = this.model.getClients();
		if (data != null) {
			for (Client e : data) {
				str += e.toString() + "\n";
			}
		}
		System.out.println("--------------------- CLIENTES---------------------");
		System.out.println(str);

		return str;
	}

	public String showRestaurants() {
		String str = "";
		ArrayList<Restaurant> data = this.model.getRestaurants();
		if (data != null) {
			for (Restaurant e : data) {
				str += "name " + e.getName() + "; Nit " + e.getNit() + "; Administrador " + e.getAdmiName() + "\n";
			}
		}
		System.out.println("--------------------- RESTAURANTES---------------------");
		System.out.println(str);

		return str;
	}

	public String showProducts() {
		String str = "";
		ArrayList<Product> data = this.model.getProducts();
		if (data != null) {
			for (Product e : data) {
				str += e.toString() + "\n";
			}
		}
		System.out.println("--------------------- PRODUCTOS---------------------");
		System.out.println(str);

		return str;
	}
	
	public String showOrders() {
		String str = "";
		ArrayList<Order> data = this.model.getOrders();
		if (data != null) {
			for(Order e : data) {
				/*
				str+=e.toString()+"\n";
				str+="\n";
				str+= "		Productos de orden "+e.getCode()+"\n";
				str+=e.showProducts();
				str+="\n";
				*/
				str+=e.toString();
			}
		}	
		System.out.println("--------------------- ORDENES---------------------");
		System.out.println(str);
		return str;
	}

	public void ReadRestaurant() {
		System.out.println("Digita el Nombre del Restaurante");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digita el número de identificación del Nuevo Restaurante");
		String nit = sc.nextLine();
		System.out.println("Digita el nombre del Administrador del Restaurante " + name);
		String admiName = sc.nextLine();
		Restaurant newRestaurant = new Restaurant(name, nit, admiName);
		model.addRestaurant(newRestaurant);
		System.out.println(newRestaurant.toString());

	}

	public void ReadProduct() {
		System.out.println("Digita el Nombre del Nuevo Producto");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digita el codigo del Nuevo Producto");
		String code = sc.nextLine();
		System.out.println("Digita la Descripción del producto");
		String description = sc.nextLine();
		System.out.println("Digita el tipo Nit del Restaurante");
		String nitRestaurant = sc.nextLine();
		System.out.println("Digita el Precio del Producto");
		int price = sc.nextInt();
		Product newProduct = new Product(code, name, description, nitRestaurant, price);
		model.addProduct(newProduct);

	}

	public void ReadClient() {
		System.out.println("Digita el Nombre del Nuevo cliente");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digita el Apellido del Nuevo cliente");
		String lastName = sc.nextLine();
		System.out.println("Digita el número de identificación del Nuevo cliente");
		String idNumber = sc.nextLine();
		System.out.println("Digita el tipo de documento del cliente");
		String idType = sc.nextLine();
		System.out.println("Digita el numero de contacto del Nuevo cliente");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Digita el domicilio del Nuevo cliente");
		String adrress = sc.nextLine();
		Client newClient = new Client(idType, idNumber, name, lastName, phone, adrress);
		model.addClient(newClient);

	}

	public void ReadOrder() {
		System.out.println("Digita el Estado de la Orden");
		System.out.println("	1. para SOLICITADO");
		System.out.println("	2. para EN PROCESO");
		System.out.println("	3. para ENVIADO");
		System.out.println("	4. para ENTREGADO");
		int state = sc.nextInt();
		System.out.println("Digita el número de identificación del Cliente");
		sc.nextLine();
		String idClient = sc.nextLine();
		System.out.println("Digita el Nit del Restaurante");
		String nitRestaurant = sc.nextLine();
		int code = (int) Math.random();
		Date date = new Date();
		ArrayList<Product> products = new ArrayList();
		int x = -1;

		while(x!=0) {
			System.out.println("Deseas ingresar productos");
			System.out.println("	0. No");
			System.out.println("	1. Si");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Por favor igrese el codigo del producto ");
				sc.nextLine();
				String nameProduct = sc.nextLine();
				Product pr = addProductsToOrder(nameProduct);
				products.add(pr);
				break;		
			}
		}
		Order newOrder = new Order(state, code, date, idClient, nitRestaurant, products);
		model.addOrder(newOrder);

	}

	public void setRestaurant() {
		System.out.println("Digita el número de identificación del Restaurante a actualizar");
		sc.nextLine();
		String nit = sc.nextLine();
		System.out.println("Digita el nuevo Nombre del Restaurante");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digita el nuevo nombre del Administrador del Restaurante " + name);
		sc.nextLine();
		String admiName = sc.nextLine();
		model.updateRestaurant(nit, name, admiName);
	}

	public void setProduct() {
		System.out.println("Digite el codigo del Producto a actualizar");
		sc.nextLine();
		String code = sc.nextLine();
		System.out.println("Digite el nuevo nombre del Producto");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Digite la nueva Descripción del producto");
		sc.nextLine();
		String description = sc.nextLine();
		System.out.println("Digite el nuevo tipo Nit del Restaurante");
		String nitRestaurant = sc.nextLine();

		System.out.println("Digita el nuevo Precio del Producto");
		int price = sc.nextInt();
		model.updateProduct(code, name, description, nitRestaurant, price);
	}

	/// TERMINAR
	public void setOrder() {
		System.out.println("Digita el codigo de la Orden");
		String code = sc.nextLine();
		System.out.println("Digita el nuevo Estado de la Orden");
		System.out.println("	1. para SOLICITADO");
		System.out.println("	2. para EN PROCESO");
		System.out.println("	3. para ENVIADO");
		System.out.println("	4. para ENTREGADO");
		int state = sc.nextInt();
		System.out.println("Digita el número de identificación del Cliente");
		sc.nextLine();
		String idClient = sc.nextLine();
		System.out.println("Digita el Nit del Restaurante");
		sc.nextLine();
		String nitRestaurant = sc.nextLine();
		Date date = new Date();
		ArrayList<Product> products = new ArrayList();
		int x = -1;

		while(x!=0) {
			System.out.println("Deseas ingresar productos");
			System.out.println("	0. No");
			System.out.println("	1. Si");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Por favor igrese el codigo del producto ");
				sc.nextLine();
				String nameProduct = sc.nextLine();
				Product pr = addProductsToOrder(nameProduct);
				products.add(pr);
				break;		
			}
		}
		model.updateOrder(code, date, idClient, nitRestaurant, products);
	}
	
	public Product addProductsToOrder(String nameProduct){
		 Product list = null;	
		 boolean encontrado = false;
		 for (int i = 0; i < model.getProducts().size(); i++) {
				if (model.getProducts().get(i).getCode().equalsIgnoreCase(nameProduct)) {
					list = model.getProducts().get(i);
					encontrado = true;
				}
			}
		 if (encontrado == false) {
			System.out.println("Producto no encontrado");
		}
		 return list;
	}
	
	
	
	public void setClient() {
		System.out.println("Digita el número de identificación del Cliente");
		String idNumber = sc.nextLine();
		System.out.println("Digita el tipo de identificación del Cliente");
		String idType = sc.nextLine();
		System.out.println("Digita el nombre del Cliente");
		String name = sc.nextLine();
		System.out.println("Digita el apellido del Cliente");
		String lastName = sc.nextLine();
		System.out.println("Digita el telefono");
		int phone = sc.nextInt();
		System.out.println("Digita la direccion ");
		String adrress = sc.nextLine();
		
		model.updateClient(idNumber, idType, name, lastName, phone, adrress);
	}

	public void searchClient() {
		System.out.println("Digita el nombre del cliente a buscar");
		sc.nextLine();
		String name = sc.nextLine();
		try {
			model.searchClient(name);
		} catch (ClientNoFoundException e) {
			e.getMessage();
		}
	}
	
	public  void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] < matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    }
	
	public  void Insercion (int[] vector) {
	      for (int i=1; i < vector.length; i++) {
	         int aux = vector[i];
	         int j;
	         for (j=i-1; j >= 0 && vector[j] > aux; j--){
	              vector[j+1] = vector[j];
	          }
	         vector[j+1] = aux;
	      }
	   }
	public void writeFileCSV() {
		System.out.println("Por favor ingrese un nombre para el archivo");
		sc.nextLine();
		String nameFile = sc.nextLine();
		String salidaArchivo = "./doc/"+nameFile+".csv";
		boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
		if(existe) {
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }
        
        try {
            // Crea el archivo
            //CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true));
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ';');
            
            // Datos para identificar las columnas
            salidaCSV.write("Pedido;");
            salidaCSV.write("Datos Producto;");
            salidaCSV.write("Datos Restaurante;");
            salidaCSV.write("Datos del Cliente;");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            int n = model.getOrders().size();
            int[] nitRes = new int[n];
            int[] idCli= new int[n];
            int[] codProd = new int[n];
            
            
            for(int i =0; i < n; i++) {
            	nitRes[i] = Integer.parseInt(model.getOrders().get(i).getNitRestaurant());
            	idCli[i] = Integer.parseInt(model.getOrders().get(i).getClient());
            	codProd[i] = model.getOrders().get(i).getCode();
            }
            
            // Recorremos la lista y lo insertamos en el archivo
         
            
            
            for(Order e : model.getOrders()) {
            	//salidaCSV.write();
            	
                salidaCSV.write(e.toString());         
                //salidaCSV.write(e.);
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
           
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
	}


	public void readClientsCSV() {
		Path filePath = Paths.get("./doc/clients.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String linea;
			int contador = 0;
			while ((linea = br.readLine()) != null) {
				if (contador != 0) {
					String[] datosLinea = linea.split(",");
					String idType = datosLinea[0];
					String idNumber = datosLinea[1];
					String name = datosLinea[2];
					String lastName = datosLinea[3];
					String strPhone = datosLinea[4].trim();
					String address = datosLinea[5];
					int phone = Integer.parseInt(strPhone);
					Client newClient = new Client(idType, idNumber, name, lastName, phone, address);
					model.addClient(newClient);
				}
				contador++;
			}
			
			for(Client e : model.getClients()) {
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void readRestaurantsCSV() {
		Path filePath = Paths.get("./doc/restaurants.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String linea;
			int contador = 0;
			while ((linea = br.readLine()) != null) {
				if (contador != 0) {
					String[] datosLinea = linea.split(",");
					String name = datosLinea[0];
					String nit = datosLinea[1];
					String admiName = datosLinea[2];

					Restaurant newRestaurant = new Restaurant(name, nit, admiName);
					model.addRestaurant(newRestaurant);
				}
				contador++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void readProductsCSV() {
		Path filePath = Paths.get("./doc/products.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String linea;
			int contador = 0;
			while ((linea = br.readLine()) != null) {
				if (contador != 0) {
					String[] datosLinea = linea.split(",");
					String code = datosLinea[0];
					String name = datosLinea[1];
					String description = datosLinea[2];
					String nitRestaurant = datosLinea[3];
					int price = Integer.parseInt(datosLinea[4].trim());
					Product newProduct = new Product(code, name, description, nitRestaurant, price);
					model.addProduct(newProduct);
				}
				contador++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void startProgram() {
		initialize();
		int x = -1;
		while (x != 0) {
			menu();
			x = sc.nextInt();
			switch (x) {
			case 1:
				model.insercionPhoneNumbers();
				break;
			case 2:
				model.bubbleSortRestaurants();
				break;
			case 3:
				showProducts();
				break;
			case 4:
				showOrders();
				break;
			case 5:
				setClient();
				break;
			case 6:
				setRestaurant();
				break;
			case 7:
				setProduct();
				break;
			case 8:
				setOrder();
				break;
			case 9:
				ReadClient();
				break;
			case 10:
				ReadRestaurant();
				break;
			case 11:
				ReadProduct();
				break;			
			case 12:
				ReadOrder();
				break;
			case 13:
				searchClient();
				break;
			case 14:
				readClientsCSV();
				break;
			case 15:
				readProductsCSV();
				break;
			case 16:
				ReadRestaurant();;
				break;
			case 17:
				writeFileCSV();;
				break;

			}

		}

	}
	
}
