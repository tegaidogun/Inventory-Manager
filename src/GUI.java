import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTes;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JLabel lblProductSales;
	private JLabel lblProductName;
	private JTextField textField_7;
	private JButton btnReflectChanges;
	private JLabel lblProductRest;
	private JLabel lblNewLabel_1;
	private JTextField textField_9;
	private JLabel lblQuantityAddedTo;
	private JTextField textField_10;
	private JButton btnReflectChanges_1;
	private JLabel lblDisplayInventory;
	private JButton btnReflectChanges_2;
	private JLabel lblDisplayTheCurrent;
	private JLabel lblChangeInProduct;
	private JLabel lblProductName_1;
	private JTextField textField_11;
	private JLabel lblNewPricePer;
	private JTextField textField_12;
	private JButton btnReflectChanges_3;
	private JButton btnReflectChanges_4;
	private JLabel lblProductSales_1;
	private JLabel lblProductName_2;
	private JLabel lblQuantitySold_1;
	private JTextField textField_13;
	private JTextField textField_14;
	private JButton btnReflectChanges_5;
	public JTextArea textArea;
	private JLabel lblDisplayProduct;
	private JLabel lblProductName_3;
	private JTextField textField_8;
	private JButton btnReflectChanges_6;
	private JLabel lblStreet;
	private JLabel lblCity;
	private JLabel lblStateegNy;
	private JLabel lblZipCode;

	public GUI() {
		Database database = new Database();
		
		setTitle("ABC ENTERPRISE INVENTORY MANAGER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1513, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 60, 108, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(212, 60, 156, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblManufacturerName = new JLabel("Manufacturer Name");
		lblManufacturerName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblManufacturerName.setBounds(10, 96, 156, 25);
		contentPane.add(lblManufacturerName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 96, 156, 24);
		contentPane.add(textField_1);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setToolTipText("");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(10, 130, 68, 25);
		contentPane.add(lblAddress);
		
		txtTes = new JTextField();
		txtTes.setToolTipText("Street");
		txtTes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTes.setColumns(10);
		txtTes.setBounds(212, 130, 156, 24);
		contentPane.add(txtTes);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("City");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 164, 156, 24);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("ZIP / POSTAL CODE");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(212, 232, 156, 24);
		contentPane.add(textField_4);
		
		JLabel lblPricePerUnit = new JLabel("Price per Unit of Product");
		lblPricePerUnit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPricePerUnit.setBounds(10, 266, 173, 25);
		contentPane.add(lblPricePerUnit);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(212, 266, 156, 24);
		contentPane.add(textField_5);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantity.setBounds(10, 301, 156, 25);
		contentPane.add(lblQuantity);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(212, 301, 156, 24);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Add New Product");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.addToInventory(new Product(new Manufacturer(textField_1.getText(), new Address(txtTes.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText())), textField.getText(), Double.parseDouble(textField_5.getText()), Double.parseDouble(textField_6.getText())));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 336, 173, 29);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("State");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 198, 156, 24);
		contentPane.add(textField_3);
		
		JLabel lblCreateANew = new JLabel("Create a New Product Listing");
		lblCreateANew.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCreateANew.setBounds(10, 25, 247, 25);
		contentPane.add(lblCreateANew);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(863, 26, 626, 623);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea.setLineWrap(true);
		textArea.setBounds(399, 33, 440, 623);
		contentPane.add(scrollPane);
		
		lblProductSales = new JLabel("Delete a Product Listing");
		lblProductSales.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductSales.setBounds(10, 413, 247, 25);
		contentPane.add(lblProductSales);
		
		lblProductName = new JLabel("Product Name");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProductName.setBounds(10, 448, 156, 25);
		contentPane.add(lblProductName);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(212, 448, 156, 24);
		contentPane.add(textField_7);
		
		btnReflectChanges = new JButton("Reflect Changes");
		btnReflectChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.deleteFromInventory(database.locate(textField_7.getText()));;
			}
		});
		btnReflectChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges.setBounds(10, 480, 173, 29);
		contentPane.add(btnReflectChanges);
		
		lblProductRest = new JLabel("Product Restockings");
		lblProductRest.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductRest.setBounds(430, 25, 247, 25);
		contentPane.add(lblProductRest);
		
		lblNewLabel_1 = new JLabel("Product Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(430, 60, 108, 25);
		contentPane.add(lblNewLabel_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(665, 60, 156, 24);
		contentPane.add(textField_9);
		
		lblQuantityAddedTo = new JLabel("Quantity Added to Stock");
		lblQuantityAddedTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantityAddedTo.setBounds(430, 96, 217, 25);
		contentPane.add(lblQuantityAddedTo);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(665, 96, 156, 24);
		contentPane.add(textField_10);
		
		btnReflectChanges_1 = new JButton("Reflect Changes");
		btnReflectChanges_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.locate(textField_9.getText()).quantityReorder(Double.parseDouble(textField_10.getText()));
			}
		});
		btnReflectChanges_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_1.setBounds(430, 132, 173, 29);
		contentPane.add(btnReflectChanges_1);
		
		lblDisplayInventory = new JLabel("Display Inventory");
		lblDisplayInventory.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisplayInventory.setBounds(430, 206, 247, 25);
		contentPane.add(lblDisplayInventory);
		
		btnReflectChanges_2 = new JButton("Display Inventory of Current Stock");
		btnReflectChanges_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				database.displayInventory();
			}
		});
		btnReflectChanges_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_2.setBounds(430, 280, 285, 29);
		contentPane.add(btnReflectChanges_2);
		
		lblDisplayTheCurrent = new JLabel("Display the current stock inventory or of deleted inventory.");
		lblDisplayTheCurrent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDisplayTheCurrent.setBounds(430, 240, 423, 25);
		contentPane.add(lblDisplayTheCurrent);
		
		lblChangeInProduct = new JLabel("Change In Product Price");
		lblChangeInProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChangeInProduct.setBounds(430, 413, 247, 25);
		contentPane.add(lblChangeInProduct);
		
		lblProductName_1 = new JLabel("Product Name");
		lblProductName_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProductName_1.setBounds(430, 448, 156, 25);
		contentPane.add(lblProductName_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(665, 448, 156, 24);
		contentPane.add(textField_11);
		
		lblNewPricePer = new JLabel("New Price per Unit of Product");
		lblNewPricePer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewPricePer.setBounds(430, 482, 217, 25);
		contentPane.add(lblNewPricePer);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setColumns(10);
		textField_12.setBounds(665, 482, 156, 24);
		contentPane.add(textField_12);
		
		btnReflectChanges_3 = new JButton("Reflect Changes");
		btnReflectChanges_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.locate(textField_11.getText()).setUnitPrice(Double.parseDouble(textField_12.getText()));
			}
		});
		btnReflectChanges_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_3.setBounds(430, 517, 173, 29);
		contentPane.add(btnReflectChanges_3);
		
		btnReflectChanges_4 = new JButton("Display Inventory of Deleted Stock");
		btnReflectChanges_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				database.displayDeletedInventory();
			}
		});
		btnReflectChanges_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_4.setBounds(430, 320, 285, 29);
		contentPane.add(btnReflectChanges_4);
		
		lblProductSales_1 = new JLabel("Product Sales");
		lblProductSales_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProductSales_1.setBounds(10, 552, 247, 25);
		contentPane.add(lblProductSales_1);
		
		lblProductName_2 = new JLabel("Product Name");
		lblProductName_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProductName_2.setBounds(10, 587, 156, 25);
		contentPane.add(lblProductName_2);
		
		lblQuantitySold_1 = new JLabel("Quantity Sold");
		lblQuantitySold_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantitySold_1.setBounds(10, 621, 156, 25);
		contentPane.add(lblQuantitySold_1);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setColumns(10);
		textField_13.setBounds(212, 587, 156, 24);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setColumns(10);
		textField_14.setBounds(212, 621, 156, 24);
		contentPane.add(textField_14);
		
		btnReflectChanges_5 = new JButton("Reflect Changes");
		btnReflectChanges_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.locate(textField_13.getText()).quantitySold(Double.parseDouble(textField_14.getText()));
			}
		});
		btnReflectChanges_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_5.setBounds(10, 656, 173, 29);
		contentPane.add(btnReflectChanges_5);
		
		lblDisplayProduct = new JLabel("Display Product Information");
		lblDisplayProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisplayProduct.setBounds(430, 575, 247, 25);
		contentPane.add(lblDisplayProduct);
		
		lblProductName_3 = new JLabel("Product Name");
		lblProductName_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProductName_3.setBounds(430, 606, 156, 25);
		contentPane.add(lblProductName_3);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(665, 606, 156, 24);
		contentPane.add(textField_8);
		
		btnReflectChanges_6 = new JButton("Display Current Product Information");
		btnReflectChanges_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				database.displayProduct(database.locate(textField_8.getText()));;
			}
		});
		btnReflectChanges_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReflectChanges_6.setBounds(430, 641, 303, 29);
		contentPane.add(btnReflectChanges_6);
		
		lblStreet = new JLabel("Street");
		lblStreet.setForeground(Color.GRAY);
		lblStreet.setToolTipText("");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStreet.setBounds(140, 131, 43, 25);
		contentPane.add(lblStreet);
		
		lblCity = new JLabel("City");
		lblCity.setForeground(Color.GRAY);
		lblCity.setToolTipText("");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCity.setBounds(149, 163, 34, 25);
		contentPane.add(lblCity);
		
		lblStateegNy = new JLabel("State (e.g NY or FL)");
		lblStateegNy.setForeground(Color.GRAY);
		lblStateegNy.setToolTipText("");
		lblStateegNy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStateegNy.setBounds(41, 197, 142, 25);
		contentPane.add(lblStateegNy);
		
		lblZipCode = new JLabel("Zip code");
		lblZipCode.setForeground(Color.GRAY);
		lblZipCode.setToolTipText("");
		lblZipCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblZipCode.setBounds(123, 232, 60, 25);
		contentPane.add(lblZipCode);
		
		redirectSystemStreams();
					
	}
	
	private void updateTextArea(final String text) {
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        textArea.append(text);
	      }
	    });
	  }

	  private void redirectSystemStreams() {
	    OutputStream out = new OutputStream() {
	      @Override
	      public void write(int b) throws IOException {
	        updateTextArea(String.valueOf((char) b));
	      }

	      @Override
	      public void write(byte[] b, int off, int len) throws IOException {
	        updateTextArea(new String(b, off, len));
	      }

	      @Override
	      public void write(byte[] b) throws IOException {
	        write(b, 0, b.length);
	      }
	    };

	    System.setOut(new PrintStream(out, true));
	    System.setErr(new PrintStream(out, true));
	  }
}
