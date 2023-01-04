package view;

import Fileio.fileio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.BookManager;
import model.Reader;

public class MainFrame extends javax.swing.JFrame {

    private static final String File_Book = "Sach.TXT";
    private static final String FILE_READER = "BD.TXT";
    private static final String FILE_BOOK_MANAGER = "QLMS.TXT";
    DefaultTableModel tableBook;
    DefaultTableModel tableReader;
    DefaultTableModel tableBookManager;
    ArrayList<Book> listBooks;
    ArrayList<Reader> listReader;
    ArrayList<BookManager> listBookManager;

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan ly muon sach");
        tableBook = (DefaultTableModel) table1.getModel();
        tableReader = (DefaultTableModel) table2.getModel();
        tableBookManager = (DefaultTableModel) table3.getModel();
        LoadDataToTable();
        loadIDToCbox();

        btnAdd1.addActionListener((ActionEvent e) -> {
            String bookName = txtBookName.getText();
            String bookAuthor = txtAuthor.getText();
            String bookMajor = cbox1.getItemAt(cbox1.getSelectedIndex());
            String bookYear = txtYear.getText();
            String bookAmount = txtBookAmount.getText();

            if (bookName.equals("") || bookAuthor.equals("") || bookMajor.equals("")
                    || bookYear.equals("") || bookAmount.equals("")) {
                JOptionPane.showMessageDialog(null, "chua nhap du thong tin");
                return;
            }
            try {
                int amout = Integer.parseInt(bookAmount);
                int pos = listBooks.size() - 1;
                if (pos != -1) {
                    Book.setCurrentID(listBooks.get(pos).getId());
                }
                Book book = new Book(bookName, bookAuthor, bookMajor, bookYear, amout);
                tableBook.addRow(book.toObject());
                listBooks.add(book);
                loadIDToCbox();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        });
        btnAdd2.addActionListener((e) -> {
            String readerName = txtReaderName.getText();
            String readerAddress = txtAddress.getText();
            String readerPhonenum = txtPhoneNumber.getText();

            if (readerName.equals("") || readerAddress.equals("") || readerPhonenum.equals("")) {
                JOptionPane.showMessageDialog(null, "chua nhap du thong tin");
                return;
            }
            if (readerPhonenum.length() < 9 || readerPhonenum.length() > 10 || !readerPhonenum.startsWith("0")) {
                JOptionPane.showMessageDialog(null, "so dien thoai khong hop le");
                return;
            }

            int pos = listReader.size() - 1;
            if (pos != -1) {
                Reader.setCurrentID(listReader.get(pos).getId());
            }
            Reader reader = new Reader(readerName, readerAddress, readerPhonenum);
            for (int i = 0; i < listReader.size(); i++) {
                if (listReader.get(i).equals(reader)) {
                    JOptionPane.showMessageDialog(null, "ban doc da ton tai");
                    return;
                }
            }

            tableReader.addRow(reader.toObject());
            listReader.add(reader);
            loadIDToCbox();
        });
        btnAdd3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int bookIndex = cbox2.getSelectedIndex();
                int readerIndex = cbox3.getSelectedIndex();
                String amount = txtSoluongmuon.getText();
                try {
                    int a = Integer.parseInt(amount);
                    Book b = listBooks.get(bookIndex);
                    Reader r = listReader.get(readerIndex);
                    BookManager bm = new BookManager(b, r, a);
                    for(int i=0;i<listBookManager.size();i++){
                        if(listBookManager.get(i).equals(bm)){
                            JOptionPane.showMessageDialog(null, "ban da muon sach nay roi");
                            return;
                        }
                    }
                    tableBookManager.addRow(bm.toObjects());
                    listBookManager.add(bm);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "nhap sai dinh dang");
                }
              
            }
        });
        saveToFile(btnSave1, listBooks, File_Book);
        saveToFile(btnSave2, listReader, FILE_READER);
        saveToFile(btnSave3, listBookManager, FILE_BOOK_MANAGER);
    }

    private void LoadDataToTable() {
        listBooks = new ArrayList<>();
        listReader = new ArrayList<>();
        listBookManager = new ArrayList<>();
        fileio.readfromfile(listBooks, File_Book);
        fileio.readfromfile(listReader, FILE_READER);
        listBooks.forEach((b)
                -> {
            tableBook.addRow(b.toObject());
        }
        );
        listReader.forEach((r)
                -> {
            tableReader.addRow(r.toObject());
        }
        );
        listBookManager.forEach(bm -> {
            tableBookManager.addRow(bm.toObjects());
        });

    }

    private void loadIDToCbox() {
        cbox2.removeAllItems();
        cbox3.removeAllItems();

        listBooks.forEach((b) -> {
            cbox2.addItem(b.getId() + "");
        });
        listReader.forEach((r) -> {
            cbox3.addItem(r.getId() + "");
        });
    }

    private void saveToFile(JButton btn, ArrayList list, String file) {
        btn.addActionListener((ActionEvent e) -> {
            fileio.writetofile(list, file);
            JOptionPane.showMessageDialog(null, "Luu file thanh cong");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbox2 = new javax.swing.JComboBox<>();
        cbox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtSoluongmuon = new javax.swing.JTextField();
        btnAdd3 = new javax.swing.JButton();
        btnSave3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtReaderName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();
        btnSave2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBookAmount = new javax.swing.JTextField();
        btnAdd1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        cbox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");

        jLabel6.setText("Chon ma sach");

        jLabel9.setText("Chon ma ban doc");

        jLabel10.setText("So luong muon");

        btnAdd3.setText("Them");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        btnSave3.setText("Luu vao file");

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma sach", "Ten sach", "Ma BD", "Ten BD", "So luong"
            }
        ));
        jScrollPane3.setViewportView(table3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(cbox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoluongmuon)
                    .addComponent(btnAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoluongmuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdd3)
                        .addGap(32, 32, 32)
                        .addComponent(btnSave3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mượn sách", jPanel3);

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Số điện thoại");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtReaderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReaderNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Tên bạn đọc");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bạn đọc", "Tên bạn đọc", "Địa chỉ", "Số điện thoại"
            }
        ));
        jScrollPane2.setViewportView(table2);

        jLabel13.setText("Địa chỉ");

        btnAdd2.setText("Thêm");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnSave2.setText("Lưu vào file");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(txtReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtAddress)
                    .addComponent(txtPhoneNumber)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(btnSave2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd2, txtAddress, txtPhoneNumber, txtReaderName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAdd2)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtPhoneNumber, txtReaderName});

        jTabbedPane1.addTab("Bạn đọc", jPanel2);

        jLabel1.setText("Tên Sách");

        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Tác giả");

        jLabel3.setText("Chuyên ngành");

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        jLabel4.setText("Năm xuất bản");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        jLabel5.setText("Số lượng");

        txtBookAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAmountActionPerformed(evt);
            }
        });

        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnSave1.setText("Lưu vào file");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Chuyên ngành", "Năm xuất bản", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(table1);

        cbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Điện tự viễn thông", "Khoa học Tự nhiên", "Văn học-Nghệ thuật" }));
        cbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtYear)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(cbox1, 0, 0, Short.MAX_VALUE)
                    .addComponent(txtAuthor)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBookAmount)
                    .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbox1, txtAuthor, txtBookAmount, txtBookName, txtYear});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sách", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void txtBookAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookAmountActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void cbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox1ActionPerformed

    private void txtReaderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReaderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReaderNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnSave3;
    private javax.swing.JComboBox<String> cbox1;
    private javax.swing.JComboBox<String> cbox2;
    private javax.swing.JComboBox<String> cbox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookAmount;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtReaderName;
    private javax.swing.JTextField txtSoluongmuon;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
