package org.spring.komoranreview.komoran;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

import java.util.List;

public class KomoranTest {

  public static void main(String[] args) {

    Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);

    String test = "아버지가 방에 들어가신다";
    KomoranResult komoranResult = komoran.analyze(test);

    System.out.println(komoranResult);
    System.out.println(komoranResult.getPlainText());

    List<Token> tokenList = komoranResult.getTokenList();
    System.out.println(tokenList);

    for(Token token : tokenList){
      System.out.println(token);
    }

  }


}


