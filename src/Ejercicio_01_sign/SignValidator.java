package Ejercicio_01_sign;

import Materia.Pilas.GenericStack;

/**
 * SignValidator
 */
public class SignValidator {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        GenericStack<Character> q = new GenericStack<>();
        for (char c : chars) {

            switch (c) {
                case ')':
                    if (!q.peek().equals('('))
                        return false;
                    q.pop();

                    break;
                case ']':
                    if (!q.peek().equals('['))
                        return false;
                    q.pop();
                    break;
                case '}':
                    if (!q.peek().equals('{'))
                        return false;
                    q.pop();
                    break;
                default:
                    q.push(c);
                    break;
            }
        }
        if (q.getSize() > 0) {
            return false;
        }
        return true;
    }
}