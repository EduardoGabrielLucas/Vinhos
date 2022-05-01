package apoio;

import java.text.*;
import java.util.Date;
import java.util.Locale;
import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author dudub
 */
public class Formatacao {

    static DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    /**
     *
     * @param formato
     * @return
     */
    public static JFormattedTextField getFormatado(String formato) {
        JFormattedTextField campoFormatado = null;
        MaskFormatter format = new MaskFormatter();

        format.setPlaceholderCharacter(' ');
        format.setValueContainsLiteralCharacters(false);

        try {
            format.setMask(formato);
            campoFormatado = new JFormattedTextField(format);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return campoFormatado;
    }

    /**
     *
     * @param campo
     */
    public static void formatarDecimal(JTextField campo) {
        campo.setText(df.format(Double.parseDouble(campo.getText())));
    }

    /**
     *
     * @param valor
     * @return
     */
    public static String formatarDecimal(double valor) {
        NumberFormat formatter = new DecimalFormat("###0.00");
        return (formatter.format(valor));
    }

    /**
     *
     * @return
     */
    public static JFormattedTextField getTelefone() {
        return getFormatado("(##) ####-####");
    }

    /**
     *
     * @return
     */
    public static JFormattedTextField getCNPJ() {
        return getFormatado("##.###.###/####-##");
    }

    /**
     *
     * @return
     */
    public static JFormattedTextField getCPF() {
        return getFormatado("###.###.###-##");
    }

    /**
     *
     * @return
     */
    public static JFormattedTextField getData() {
        return getFormatado("##/##/####");
    }

    /**
     *
     * @return
     */
    public static JFormattedTextField getDataHora() {
        return getFormatado("##/##/#### ##:##");
    }

    /**
     *
     * @param campo
     */
    public void formatoDecimal(JTextField campo) {
        campo.setText(df.format(Double.parseDouble(campo.getText())));
    }

    /**
     *
     * @param campo
     */
    public static void formatarData(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##/##/####");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     *
     * @param campo
     */
    public static void formatarCpf(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("###.###.###-##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     *
     * @param campo
     */
    public static void formatarCnpj(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##.###.###/####-##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     *
     * @param campo
     */
    public static void formatarTelefone(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("(##)####-####");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     *
     * @param data
     * @return
     */
    public static String ajustaDataDMA(String data) {
        String dataFormatada = null;
        try {
            Date dataAMD = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataAMD);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (dataFormatada);
    }

    /**
     *
     * @param data
     * @return
     */
    public static String ajustaDataAMD(String data) {
        String dataFormatada = null;
        try {
            Date dataDMA = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            dataFormatada = new SimpleDateFormat("yyyy-MM-dd").format(dataDMA);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (dataFormatada);
    }

    /**
     *
     * @param dado
     * @return
     */
    public static String removerFormatacao(String dado) {
        String retorno = "";
        for (int i = 0; i < dado.length(); i++) {
            if (dado.charAt(i) != '.' && dado.charAt(i) != '/' && dado.charAt(i) != '-') {
                retorno = retorno + dado.charAt(i);
            }
        }
        return (retorno);
    }

    /**
     *
     * @return
     */
    public static String getDataAtual() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(now);

        return dataHoje;
    }

    /**
     *
     * @return
     */
    public static String getDataHoraAtual() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHoje = df.format(now);

        return dataHoje;
    }
}

