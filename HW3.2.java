package com.company;

public class EditTextApp {

    public static void main(String[] args) {
        EditTextApp start = new EditTextApp();
        String [] roles =  {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder result  = start.printTextPerRole(roles, textLines);
        System.out.print(result);
    }

    private StringBuilder printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            int counter = 1;
            builder.append("\n").append(roles[i]).append(":");
            for (int j = 0; j < textLines.length; j++) {
                int index = textLines[j].indexOf(roles[i]);
                if (index != -1) {
                    builder.append("\n").append(j + 1).append(")").append(textLines[j].substring(textLines[j].indexOf(':') + 1));
                    counter++;
                }
            }
        }
        return builder;
    }
}
