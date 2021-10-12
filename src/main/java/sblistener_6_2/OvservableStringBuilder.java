package sblistener_6_2;

import stringBuilderWithUndo_6_1.Action;
import stringBuilderWithUndo_6_1.SBWithUndo;

public class OvservableStringBuilder {
    private OnStringBuilderChangeListener onChangeListener;
    private StringBuilder stringBuilder;

    public OvservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public void setOnStringBuilderChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }
    public OvservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder reverse() {
        stringBuilder.reverse();
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyOnStringBuilderChangeListener();
        return this;
    }


    public OvservableStringBuilder append(StringBuffer sb) {
        stringBuilder.append(sb);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder append(CharSequence cs) {
        stringBuilder.append(cs);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder append(char[] str) {
        stringBuilder.append(str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifyOnStringBuilderChangeListener();
        return this;
    }


    public String toString() {
        return stringBuilder.toString();
    }
}
