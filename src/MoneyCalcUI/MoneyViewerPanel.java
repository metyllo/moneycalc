package MoneyCalcUI;

import Model.MoneyViewer;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Model.Money;

public class MoneyViewerPanel extends JPanel implements MoneyViewer{
    private JLabel label;

    public MoneyViewerPanel() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.createComponents();
    }
    
    @Override
    public void show(Money money) {
        label.setText(money.toString());
    }

    private void createComponents() {
        this.add(createMoneyDisplay());
    }

    private JLabel createMoneyDisplay() {
        label = new JLabel();
        return label;
    }

}
