package stringBuilderWithUndo_6_1;

import java.util.Stack;

public class SBWithUndo {

    private class DeleteAction implements Action {
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        @Override
        public void undo() {
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }

    private StringBuilder stringBuilder;

    private Stack<Action> actions = new Stack<>();

    public SBWithUndo() {
        stringBuilder = new StringBuilder();
    }

    public SBWithUndo reverse() {
        stringBuilder.reverse();
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.reverse();
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo append(String str) {
        stringBuilder.append(str);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo append(Object obj) {
        stringBuilder.append(String.valueOf(obj));
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - String.valueOf(obj).length() - 1, stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo append(StringBuffer sb) {
        stringBuilder.append(sb);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - sb.length() - 1, stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo append(CharSequence cs) {
        stringBuilder.append(cs);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - cs.length() - 1, stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo append(char[] str) {
        stringBuilder.append(str);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - str.length, stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public SBWithUndo appendCodePoint(int codePoint) {
        int lenghtBefore = stringBuilder.length();
        stringBuilder.appendCodePoint(codePoint);
        actions.add(new DeleteAction(stringBuilder.length() - lenghtBefore));
        return this;
    }

    public SBWithUndo delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start, deleted));
        return this;
    }

    public SBWithUndo deleteCharAt(int index) {
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        actions.add(() -> stringBuilder.insert(index, deleted));
        return this;
    }

    public SBWithUndo replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        actions.add(() -> stringBuilder.replace(start, end, deleted));
        return this;
    }

    public SBWithUndo insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        actions.add(() -> stringBuilder.delete(index, len));
        return this;
    }

    public SBWithUndo insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset, str.length()));
        return this;
    }

    public void undo() {
        if (!actions.isEmpty()) {
            actions.pop().undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}


