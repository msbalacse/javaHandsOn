import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class AccountFrame extends JFrame {
    JLabel accNoLBL,ownerLBL,balanceLBL,cityLBL,genderLBL,amountLBL;
    JTextField accNoTXT,ownerTXT,balanceTXT,cityTXT,amountTXT;
    JComboBox<City> citiesCMB;

    JButton newBTN,saveBTN,showBtn,quitBTN,depositBTN,withdrawBTN;
    JRadioButton maleRDB,femaleRDB;
    ButtonGroup genderBTNGRP;

    JList<Account> accountsLST;
    JPanel p1,p2,p3,p4,p5;

    Set<Account> accountSet = new TreeSet<>();
    Account acc, x;
    boolean newRec = true;

    //table
    DefaultComboBoxModel<City> citiesCMBMDL;
    DefaultListModel<Account> accountsLSTMDL;

    JTable table;
    DefaultTableModel tableModel;
    ArrayList<Transaction> translist = new ArrayList<>();


    public AccountFrame() {

    super("Account Operations");
    setLayout(null);
    setSize(600,400);

    // adding components to the frame

        accNoLBL = new JLabel("Account No.");
        ownerLBL = new JLabel("Owner");
        balanceLBL = new JLabel("Balance");
        cityLBL = new JLabel("City");
        genderLBL = new JLabel("Gender");
        amountLBL = new JLabel("Amount");

    // text fields

        accNoTXT = new JTextField();
        accNoTXT.setEnabled(false);
        ownerTXT = new JTextField();
        balanceTXT = new JTextField(); balanceTXT.setEnabled(false);
        cityTXT = new JTextField();
        amountTXT = new JTextField();
        amountTXT.setPreferredSize(new Dimension(150,25));

    // ComboBox

        citiesCMBMDL = new DefaultComboBoxModel<>();
        citiesCMBMDL.addElement(null);
        citiesCMBMDL.addElement(new City("Brooklen","NewYork"));
        citiesCMBMDL.addElement(new City("Madurai","Tamilnadu"));
        citiesCMBMDL.addElement(new City("Nagercoil","Tamilnadu"));
        citiesCMBMDL.addElement(new City("Kochi","Kerela"));

    // adding data to JCOMBOBOX
        citiesCMB = new JComboBox<City>(citiesCMBMDL);

    // radio buttons

        maleRDB = new JRadioButton("male",true);
        femaleRDB = new JRadioButton("female");
        genderBTNGRP =new ButtonGroup();
        genderBTNGRP.add(maleRDB);
        genderBTNGRP.add(femaleRDB);

    // buttons

        newBTN = new JButton("new");
        saveBTN = new JButton("save");
        showBtn = new JButton("Show");
        quitBTN = new JButton("Quit");
        depositBTN = new JButton("Deposit");
        withdrawBTN = new JButton("Withdraw");

    // Table

    accountsLSTMDL = new DefaultListModel<>();
    accountsLST = new JList<>(accountsLSTMDL);

    // panels

        p1 = new JPanel(); p1.setBounds(5,5,300,150);
        p1.setLayout(new GridLayout(5,2));

        p2 =new JPanel(); p2.setBounds(5,155,300,40);
        p2.setLayout(new FlowLayout());

        p3 = new JPanel(); p3.setBounds(5,195,600,40);
        p3.setLayout(new FlowLayout());

        p4 = new JPanel(); p4.setBounds(305,5,300,190);
        p4.setLayout(new BorderLayout());

        p5 = new JPanel(); p5.setBounds(5,240,580,120);
        p5.setLayout(new BorderLayout());

    // adding components to panel

        p1.add(accNoLBL);
        p1.add(accNoTXT);
        p1.add(ownerLBL);
        p1.add(ownerTXT);
        p1.add(balanceLBL);
        p1.add(balanceTXT);
        p1.add(cityLBL);
        p1.add(cityTXT);
        p1.add(maleRDB);
        p1.add(femaleRDB);

        p2.add(newBTN);
        p2.add(saveBTN);
        p2.add(showBtn);
        p2.add(quitBTN);


        p3.add(amountLBL);
        p3.add(amountTXT);
        p3.add(depositBTN);
        p3.add(withdrawBTN);


        p4.add(accountsLST);








    // adding panel to frame

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);


    // table creation

        tableModel = new DefaultTableModel();

        table = new JTable(tableModel);
        tableModel.addColumn("TraNO");
        tableModel.addColumn("TraDate");
        tableModel.addColumn("TraType");
        tableModel.addColumn("TrsAmount");

        JScrollPane scrollPane = new JScrollPane(table);
        p5.add(scrollPane);

    /******************* Methods ***************************/

    newBTN.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            accNoTXT.setText("");
            ownerLBL.setText("");

            citiesCMB.setSelectedIndex(0);
            maleRDB.setEnabled(true);
            balanceTXT.setText("");
            amountTXT.setText("");
            newRec = true;
        }
    });

    saveBTN.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(newRec){
                // Insertion
                if(ownerTXT.getText().length() !=0){
                    acc = new Account(
                            ownerTXT.getText(),
                            (City) citiesCMB.getSelectedItem(),
                            maleRDB.isSelected()? 'M':'F'
                    );
                    accNoTXT.setText(String.valueOf(acc.accNo));
                     accountSet.add(acc);
                    accountsLSTMDL.addElement(acc);
                    newRec = false;
                }else{
                    JOptionPane.showMessageDialog(null,"Please Fill All the Fields");
                }
            }else {
                // Updating
                accountSet.remove(acc);

                int a = Integer.parseInt(accNoTXT.getText());
                String o = ownerTXT.getText();
                City c = (City) citiesCMB.getSelectedItem();

                char g = maleRDB.isSelected()?'M':'F';
                double b = Double.parseDouble(balanceTXT.getText());
                acc = new Account(a,o,c,g,b);
                accountsLSTMDL.setElementAt(acc,accountsLST.getSelectedIndex());
                newRec = false;
            }

        }
    });


    showBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s ="";
            Iterator<Account> it = accountSet.iterator();
            while(it.hasNext()){
                s+= it.next().toString()+"/n";
                JOptionPane.showMessageDialog(null,s);
            }
        }
    });

    depositBTN.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!newRec && amountTXT.getText().length() !=0){
                // adding transaction to table

                Transaction t = new Transaction(acc, LocalDate.now(),'D',Double.parseDouble(amountTXT.getText()));
                DisplayTransactionsInTable(t);

                // perform deposit from account
                acc.deposit(Double.parseDouble(amountTXT.getText()));
                balanceTXT.setText(String.valueOf(acc.balance));

            }
        }
    });

    }

    private void DisplayTransactionsInTable(Transaction t) {

    // Display data into table

    tableModel.addRow(new Object[]{
            t.getTrsNo(),
            t.getDate(),
            t.getOperation(),
            t.getAmount()
    });
    // adding object to arraylist
        translist.add(t);
    }


    public static void main(String[] args) {
        AccountFrame af = new AccountFrame();
         af.setVisible(true);
         af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}