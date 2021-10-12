package sblistener_6_2;

public class MyListener implements OnStringBuilderChangeListener{
    @Override
    public void onChange(OvservableStringBuilder osb) {
        System.out.println("CHANGED: " + osb.toString());
    }
}
