package com.topicos.telas.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

import com.topicos.listenners.PrincipalListenner;

public class Principal extends JFrame {

    private JPanel contentPane;

    private JMenuBar menuBar = new JMenuBar();

    private JMenu ArquivoMenu = new JMenu("Arquivo");

    private JMenuItem SairArquivoItem = new JMenuItem("Sair");

    private JMenu AdminMenu = new JMenu("Admin");

    private JMenuItem AdicionarUsuarioItem = new JMenuItem("Adicionar Usuario");

    private JMenuItem RemoverUsuarioItem = new JMenuItem("Remover Usuario");

    private JMenu AjudaMenu = new JMenu("Ajuda");

    private JMenuItem SobreItem = new JMenuItem("Sobre");

    /**
     * Create the frame.
     */
    public Principal() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/com/topicos/telas/background/sport_club_corinthians_paulista___background_by_lucasamarilla-d5v4zet.jpg")));
        setTitle("Topicos Especiais - I");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 811, 562);

        setJMenuBar(menuBar);

        menuBar.add(ArquivoMenu);

        ArquivoMenu.add(SairArquivoItem);

        menuBar.add(AdminMenu);

        AdminMenu.add(AdicionarUsuarioItem);

        AdminMenu.add(RemoverUsuarioItem);

        menuBar.add(AjudaMenu);
        SobreItem.addActionListener(new PrincipalListenner());

        AjudaMenu.add(SobreItem);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelOpcoes = new JPanel();
        panelOpcoes.setBorder(new LineBorder(null));
        panelOpcoes.setBounds(0, 0, 1920, 53);
//        panelOpcoes.setBounds(0,0,811,JFrame.MAXIMIZED_V);
        contentPane.add(panelOpcoes);
        panelOpcoes.setLayout(null);

        /*ACHO QUE VAI SRE ESSA IMAGEM DE VERDADE*/
//        ImageIcon icon = new ImageIcon(Principal.class.getResource("/com/topicos/telas/background/blur2.jpg"));

        ImageIcon icon = new ImageIcon(Principal.class.getResource("/com/topicos/telas/background/wallpaper-corinthians-campeao-mundial-de-clubes-1920x1080-fox.jpg"));

        JLabel backbround = new JLabel();
        backbround.setSize(1920, 1080);
        backbround.setIcon(icon);
        contentPane.getSize();
        contentPane.add(backbround);

        JButton btnExit = new JButton("Exit");
        btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btnExit.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnExit.setBackground(UIManager.getColor("Button.background"));
        btnExit.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/telas/icones/exit.png")));
        btnExit.setBounds(12, 6, 70, 45);
        panelOpcoes.add(btnExit);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/telas/icones/floppy_disk_sh.png")));
        btnSalvar.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnSalvar.setIconTextGap(1);
        btnSalvar.setBounds(94, 6, 70, 45);
        panelOpcoes.add(btnSalvar);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnLogout.setBounds(176, 6, 81, 45);
        btnLogout.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/telas/icones/logout.png")));
        panelOpcoes.add(btnLogout);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/telas/icones/register.png")));
        btnCadastrar.setBounds(269, 6, 131, 45);
        panelOpcoes.add(btnCadastrar);


        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        setResizable(false);
        setVisible(true);


    }
}
