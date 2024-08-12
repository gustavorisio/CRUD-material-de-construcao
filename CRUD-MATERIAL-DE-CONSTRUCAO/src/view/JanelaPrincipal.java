/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controle.ProdutoControle;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import modelo.dao.ProdutoDAO;

/**
 *
 * @author alunos
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() throws ClassNotFoundException {

        initComponents();
        obterProdutos((DefaultTableModel) TabelaProdutos.getModel());
        obterCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomeprodutoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eanprodutoTxt = new javax.swing.JTextField();
        vendaprodutoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        marcaprodutoTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pesoprodutoTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fornecedorprodutoTxt = new javax.swing.JTextField();
        custoprodutoTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        estoqueprodutoTxt = new javax.swing.JTextField();
        categoriaCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idprodutoTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        atualizarprodutoBtn = new javax.swing.JButton();
        limparBtn = new javax.swing.JButton();
        inserirprodutoBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buscaridBtn = new javax.swing.JButton();
        produtoidBtn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RecarregarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Marca", "Preco de venda", "Custo", "EAN_GTIN", "Fornecedor", "Estoque", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        nomeprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nomeprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeprodutoTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Categoria:");

        eanprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eanprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eanprodutoTxtActionPerformed(evt);
            }
        });

        vendaprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        vendaprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaprodutoTxtActionPerformed(evt);
            }
        });
        vendaprodutoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vendaprodutoTxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Preço de venda:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Marca:");

        marcaprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        marcaprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaprodutoTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("EAN/GTIN");

        pesoprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pesoprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoprodutoTxtActionPerformed(evt);
            }
        });
        pesoprodutoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoprodutoTxtKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Estoque: (un)");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Fornecedor:");

        fornecedorprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fornecedorprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorprodutoTxtActionPerformed(evt);
            }
        });

        custoprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custoprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custoprodutoTxtActionPerformed(evt);
            }
        });
        custoprodutoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                custoprodutoTxtKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Preço de custo:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Peso: (g/kg)");

        estoqueprodutoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        estoqueprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueprodutoTxtActionPerformed(evt);
            }
        });
        estoqueprodutoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estoqueprodutoTxtKeyTyped(evt);
            }
        });

        categoriaCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        categoriaCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCmbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.png"))); // NOI18N
        jLabel2.setText("DIRISIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        idprodutoTxt.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaprodutoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(custoprodutoTxt)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marcaprodutoTxt)
                                    .addComponent(nomeprodutoTxt)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idprodutoTxt)))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eanprodutoTxt)
                            .addComponent(categoriaCmb, 0, 191, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecedorprodutoTxt)
                            .addComponent(estoqueprodutoTxt)
                            .addComponent(pesoprodutoTxt))))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(eanprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoriaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idprodutoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fornecedorprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(marcaprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vendaprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)))
                        .addComponent(estoqueprodutoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custoprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(pesoprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        idprodutoTxt.setEditable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(102, 102, 102)));

        atualizarprodutoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        atualizarprodutoBtn.setText("Atualizar");
        atualizarprodutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarprodutoBtnActionPerformed(evt);
            }
        });

        limparBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        limparBtn.setText("Limpar");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        inserirprodutoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inserirprodutoBtn.setText("Adicionar novo");
        inserirprodutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirprodutoBtnActionPerformed(evt);
            }
        });

        excluirBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inserirprodutoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(limparBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atualizarprodutoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(inserirprodutoBtn)
                .addGap(30, 30, 30)
                .addComponent(atualizarprodutoBtn)
                .addGap(37, 37, 37)
                .addComponent(limparBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153)));

        buscaridBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscaridBtn.setText("Buscar");
        buscaridBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaridBtnActionPerformed(evt);
            }
        });

        produtoidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoidBtnActionPerformed(evt);
            }
        });
        produtoidBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                produtoidBtnKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Buscar produto por código ID");

        RecarregarBtn.setText("Recarregar Tabela");
        RecarregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecarregarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtoidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaridBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RecarregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaridBtn)
                    .addComponent(RecarregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void obterProdutos(DefaultTableModel modeloTab) {
        // Obter todos os produtos do controle
        modeloTab.setNumRows(0);
        java.util.List<Object[]> produtos = controle.ProdutoControle.obterTodos();
        // Adicionar os produtos obtidos ao modelo da tabela
        for (Object[] p : produtos) {
            modeloTab.addRow(p);
        }
    }

    public void obterCategorias() throws ClassNotFoundException {
        // Listar todas as categorias do controle
        java.util.List<String> categs = controle.CategoriaControle.listarTodas();
        for (String c : categs) {
            categoriaCmb.addItem(c);
        }
    }

    private void categoriaCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCmbActionPerformed

    }//GEN-LAST:event_categoriaCmbActionPerformed

    private void inserirprodutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirprodutoBtnActionPerformed
        // Obter os dados dos campos de texto
        String[] dados = new String[10];
        dados[1] = nomeprodutoTxt.getText();
        dados[3] = marcaprodutoTxt.getText();
        dados[4] = vendaprodutoTxt.getText();
        dados[5] = custoprodutoTxt.getText();
        dados[6] = eanprodutoTxt.getText();
        dados[7] = fornecedorprodutoTxt.getText();
        dados[8] = estoqueprodutoTxt.getText();
        dados[9] = pesoprodutoTxt.getText();
        try {
            // Verificar se algum campo obrigatório está vazio
            if (dados[1].isEmpty() || dados[3].isEmpty() || dados[4].isEmpty() || dados[5].isEmpty()
                    || dados[6].isEmpty() || dados[7].isEmpty() || dados[8].isEmpty() || dados[9].isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos para cadastrar o produto.");
            } else {
                // Buscar o ID da categoria selecionada no JComboBox
                dados[2] = controle.CategoriaControle.buscarId(categoriaCmb.getSelectedItem().toString());
                // Inserir o produto com os dados fornecidos
                ProdutoControle.inserirProduto(dados);
                JOptionPane.showMessageDialog(this, "Produto cadastrado! \nPara visualizar clique no botão 'Recarregar Tabela'");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inserirprodutoBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        // Obter os dados da linha selecionada na tabela
        String[] dados = new String[10];
        int linhaselecionada = -1;
        linhaselecionada = TabelaProdutos.getSelectedRow();
        if (linhaselecionada >= 0) {
            nomeprodutoTxt.setText((String) TabelaProdutos.getValueAt(linhaselecionada, 1));
            dados[0] = (TabelaProdutos.getValueAt(linhaselecionada, 0)).toString();
            dados[1] = (String) TabelaProdutos.getValueAt(linhaselecionada, 1);
            dados[2] = (TabelaProdutos.getValueAt(linhaselecionada, 2)).toString();
            try {
                controle.ProdutoControle.excluirId(dados);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "linha " + linhaselecionada + " Id = " + dados[0] + " Nome=" + dados[1] + " Id_categ = " + dados[2] + " será removida");
            ((DefaultTableModel) TabelaProdutos.getModel()).removeRow(linhaselecionada);
        } else
            JOptionPane.showMessageDialog(this, "É necessário selecionar uma linha");
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void eanprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eanprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eanprodutoTxtActionPerformed

    private void vendaprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaprodutoTxtActionPerformed

    private void marcaprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaprodutoTxtActionPerformed

    private void pesoprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoprodutoTxtActionPerformed

    private void fornecedorprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorprodutoTxtActionPerformed

    private void custoprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custoprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custoprodutoTxtActionPerformed

    private void estoqueprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoqueprodutoTxtActionPerformed

    private void atualizarprodutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarprodutoBtnActionPerformed
        String idTexto = idprodutoTxt.getText();
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para atualizar, informe o ID do produto em 'buscar produto por código ID' \n Após as alterações clique novamente em atualizar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Retorna sem continuar a operação se o campo de ID estiver vazio
        }
        ProdutoDAO dao = new ProdutoDAO();
        Produto atualizar = new Produto();
        atualizar.setId(Integer.parseInt(idprodutoTxt.getText()));
        atualizar.setNome(nomeprodutoTxt.getText());
        atualizar.setMarca(marcaprodutoTxt.getText());
        atualizar.setVenda(Double.parseDouble(vendaprodutoTxt.getText()));
        atualizar.setCusto(Double.parseDouble(custoprodutoTxt.getText()));
        atualizar.setEan(eanprodutoTxt.getText());
        atualizar.setFornecedor(fornecedorprodutoTxt.getText());
        atualizar.setEstoque(Double.parseDouble(estoqueprodutoTxt.getText()));
        atualizar.setPeso(Double.parseDouble(pesoprodutoTxt.getText()));

        // Obter o ID da categoria selecionada no JComboBox
        String nomeCategoria = categoriaCmb.getSelectedItem().toString();
        String idCategoria = "";
        try {
            idCategoria = controle.CategoriaControle.buscarId(nomeCategoria);
            if (!idCategoria.isEmpty()) {
                atualizar.setCategoria(Integer.parseInt(idCategoria));
            } else {
                JOptionPane.showMessageDialog(this, "Categoria selecionada inválida.");
                return; // Retorna sem realizar a atualização se a categoria for inválida
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar categoria.");
            ex.printStackTrace(); // Tratamento para ClassNotFoundException
            return; // Retorna sem realizar a atualização em caso de erro
        }

        try {
            dao.atualizar(atualizar);
            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");
            // Adicione aqui qualquer outra ação adicional após a atualização bem-sucedida
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar produto.");
            ex.printStackTrace(); // Tratamento para ClassNotFoundException e SQLException

        }

    }//GEN-LAST:event_atualizarprodutoBtnActionPerformed

    private void buscaridBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaridBtnActionPerformed

        modelo.dao.ProdutoDAO prod = new modelo.dao.ProdutoDAO();
        modelo.Produto p = new modelo.Produto();
        p.setId(Integer.parseInt(produtoidBtn.getText()));
        try {
            try {
                p = prod.consultarById(p);

            } catch (SQLException ex) {
                Logger.getLogger(JanelaPrincipal.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            if (p.getNome() != null) {
                idprodutoTxt.setText(String.valueOf(p.getId()));
                nomeprodutoTxt.setText(p.getNome());
                marcaprodutoTxt.setText(p.getMarca());
                if (categoriaCmb.getItemCount() > 0) {
                    categoriaCmb.setSelectedItem(p.getCategoria());
                }
                custoprodutoTxt.setText(String.valueOf(p.getCusto()));
                vendaprodutoTxt.setText(String.valueOf(p.getVenda()));
                eanprodutoTxt.setText(p.getEan());
                fornecedorprodutoTxt.setText(p.getFornecedor());
                estoqueprodutoTxt.setText(String.valueOf(p.getEstoque()));
                pesoprodutoTxt.setText(String.valueOf(p.getPeso()));

            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro de conexão com o banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscaridBtnActionPerformed

    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed

        setClear();
        carregarTable(null);
    }//GEN-LAST:event_limparBtnActionPerformed

    private void nomeprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeprodutoTxtActionPerformed

    private void produtoidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoidBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoidBtnActionPerformed

    private void vendaprodutoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendaprodutoTxtKeyTyped

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            vendaprodutoTxt.setEditable(false);
        } else {
            vendaprodutoTxt.setEditable(true);
        }
    }//GEN-LAST:event_vendaprodutoTxtKeyTyped

    private void custoprodutoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custoprodutoTxtKeyTyped

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            custoprodutoTxt.setEditable(false);
        } else {
            custoprodutoTxt.setEditable(true);
        }
    }//GEN-LAST:event_custoprodutoTxtKeyTyped

    private void estoqueprodutoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estoqueprodutoTxtKeyTyped

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            estoqueprodutoTxt.setEditable(false);
        } else {
            estoqueprodutoTxt.setEditable(true);
        }
    }//GEN-LAST:event_estoqueprodutoTxtKeyTyped

    private void pesoprodutoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoprodutoTxtKeyTyped

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            pesoprodutoTxt.setEditable(false);
        } else {
            pesoprodutoTxt.setEditable(true);
        }
    }//GEN-LAST:event_pesoprodutoTxtKeyTyped

    private void produtoidBtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoidBtnKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            produtoidBtn.setEditable(false);
        } else {
            produtoidBtn.setEditable(true);
        }
    }//GEN-LAST:event_produtoidBtnKeyTyped

    private void RecarregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecarregarBtnActionPerformed

        try {
            // Chama o método para obter produtos e preencher a tabela
            List<Object[]> produtos = ProdutoControle.obterTodos();

            // Limpa a tabela
            DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
            modelo.setRowCount(0);

            // Preenche a tabela com os produtos obtidos
            for (Object[] p : produtos) {
                modelo.addRow(p);
            }
        } catch (RuntimeException ex) {
            // Exibe uma mensagem de erro em caso de falha ao obter os produtos
            JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RecarregarBtnActionPerformed

    public void setClear() {
        idprodutoTxt.setText(null);
        nomeprodutoTxt.setText(null);
        marcaprodutoTxt.setText(null);
        custoprodutoTxt.setText(null);
        vendaprodutoTxt.setText(null);
        eanprodutoTxt.setText(null);
        pesoprodutoTxt.setText(null);
        estoqueprodutoTxt.setText(null);
        fornecedorprodutoTxt.setText(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new JanelaPrincipal().setVisible(true);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JanelaPrincipal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecarregarBtn;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton atualizarprodutoBtn;
    private javax.swing.JButton buscaridBtn;
    private javax.swing.JComboBox<String> categoriaCmb;
    private javax.swing.JTextField custoprodutoTxt;
    private javax.swing.JTextField eanprodutoTxt;
    private javax.swing.JTextField estoqueprodutoTxt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JTextField fornecedorprodutoTxt;
    private javax.swing.JTextField idprodutoTxt;
    private javax.swing.JButton inserirprodutoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparBtn;
    private javax.swing.JTextField marcaprodutoTxt;
    private javax.swing.JTextField nomeprodutoTxt;
    private javax.swing.JTextField pesoprodutoTxt;
    private javax.swing.JTextField produtoidBtn;
    private javax.swing.JTextField vendaprodutoTxt;
    // End of variables declaration//GEN-END:variables

    private void carregarTable(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
