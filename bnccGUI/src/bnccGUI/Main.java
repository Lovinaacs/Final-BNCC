package bnccGUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
	JPanel p1,p2,p3,p4;
	JLabel menuCode, menuName, menuPrice, menuStock, CodeUp, PriceUp, StockUp, CodeDel;
	JTextField codeTf, nameTf, priceTf, stockTf, CodeUpTf, PriceUpTf, StockUpTf, CodeDelTf;
	JButton insertButton, viewButton, updateButton, deleteButton;
	public Main() {
		
		//FRAME=======================================================
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		
		setFrame();
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(0, 0, 390, 368);
		tp.addTab("Insert Menu", p1);
		tp.addTab("View Menu", p2);
		tp.addTab("Update Menu", p3);
		tp.addTab("Delete Menu", p4);
		tp.setBackground(Color.blue);
		tp.setForeground(Color.white);
		this.add(tp); 
		
		//INSERT========================================================
		menuCode=new JLabel("Kode Menu :");
		menuName=new JLabel("Nama Menu :");
		menuPrice=new JLabel("Harga Menu:");
		menuStock=new JLabel("Stok Menu:");
		
		codeTf=new JTextField();
		nameTf=new JTextField();
		priceTf=new JTextField();
		stockTf=new JTextField();
		
		insertButton =new JButton("Insert Menu");
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(10,20,10,20);
		gbc.gridx=0;
		gbc.gridy=0;
		menuCode.setPreferredSize(new Dimension (150,50));
		p1.add(menuCode,gbc);
		codeTf.setPreferredSize(new Dimension (200, 30));
		p1.add(codeTf,gbc);
		menuName.setPreferredSize(new Dimension (150,50));
		p1.add(menuName,gbc);
		nameTf.setPreferredSize(new Dimension (200, 30));
		p1.add(nameTf,gbc);
		menuPrice.setPreferredSize(new Dimension (150,50));
		p1.add(menuPrice,gbc);
		priceTf.setPreferredSize(new Dimension (200, 30));
		p1.add(priceTf,gbc);
		menuStock.setPreferredSize(new Dimension (150,50));
		p1.add(menuStock,gbc);
		stockTf.setPreferredSize(new Dimension (200, 30));
		p1.add(stockTf,gbc);
		insertButton.setPreferredSize(new Dimension(150,30));
		p1.add(insertButton,gbc);
		insertButton.addActionListener(this);
		
		//VIEW===========================================================
		viewButton=new JButton("View Menu");
		
		p2.add(viewButton, BorderLayout.CENTER);
		viewButton.addActionListener(this);
		
		//UPDATE=========================================================
		updateButton =new JButton("Insert Menu");
		
		CodeUp=new JLabel("Kode Menu :");
		PriceUp=new JLabel("Harga Menu:");
		StockUp=new JLabel("Stok Menu:");

		
		CodeUpTf=new JTextField();
		PriceUpTf=new JTextField();
		StockUpTf=new JTextField();
		
		CodeUp.setPreferredSize(new Dimension (150,50));
		p3.add(CodeUp,gbc);
		CodeUpTf.setPreferredSize(new Dimension (200, 30));
		p3.add(CodeUpTf,gbc);
		
		PriceUp.setPreferredSize(new Dimension (150,50));
		p3.add(PriceUp,gbc);
		PriceUpTf.setPreferredSize(new Dimension (200, 30));
		p3.add(PriceUpTf,gbc);
		
		StockUp.setPreferredSize(new Dimension (150,50));
		p3.add(StockUp,gbc);
		StockUpTf.setPreferredSize(new Dimension (200, 30));
		p3.add(StockUpTf,gbc);
		
		updateButton.setPreferredSize(new Dimension(150,30));
		p3.add(updateButton,gbc);
		updateButton.addActionListener(this);
		
		//DELETE===========================================================
		deleteButton=new JButton("Delete Menu");
		
		CodeDel = new JLabel("Kode Menu:");
		
		CodeDelTf= new JTextField();
		
		CodeDel.setPreferredSize(new Dimension (150,50));
		p4.add(CodeUp,gbc);
		CodeDelTf.setPreferredSize(new Dimension (200, 30));
		p4.add(CodeUpTf,gbc);
		
		p4.add(deleteButton);
		deleteButton.addActionListener(this);
		
	}

	public void setFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("PT PUDDING MENU");
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == insertButton) {
			String Menu = nameTf.getText();
			String Kode = codeTf.getText();
			String Price = priceTf.getText();
			String Stock = stockTf.getText();

			if (Menu.isEmpty() || Kode.isEmpty() || Price.isEmpty() || Stock.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Informasi belum lengkap");
			} else {
				if (!Kode.startsWith("KD-") || Kode.length() != 6) {
					JOptionPane.showMessageDialog(this, "Format penulisan kode -> KD-XXX");
				} else {
					JOptionPane.showMessageDialog(this,
							"Menu " + Menu + " dengan kode " + Kode + " berhasil ditambahkan");
				}
			}

		}

		if (e.getSource() == updateButton) {
			String Kode = CodeUp.getText();
			String Price = PriceUp.getText();
			String Stock = StockUp.getText();
			if (Kode.isEmpty() || Price.isEmpty() || Stock.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Informasi belum lengkap");
			} else {
				if (!Kode.startsWith("KD-") || Kode.length() != 6) {
					JOptionPane.showMessageDialog(this, "Format penulisan kode -> KD-XXX");
				} else {
					JOptionPane.showMessageDialog(this, "Menu dengan kode " + Kode + " berhasil diupdate");
				}
			}
		}

		if (e.getSource() == deleteButton) {
			String Kode = CodeDel.getText();
			if (Kode.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Informasi belum lengkap");
			} else {
				if (!Kode.startsWith("KD-") || Kode.length() != 6) {
					JOptionPane.showMessageDialog(this, "Format penulisan kode -> KD-XXX");
				} else {
					JOptionPane.showMessageDialog(this, "Menu dengan kode " + Kode + " berhasil dihapus");
				}
			}

		}
	}

}

