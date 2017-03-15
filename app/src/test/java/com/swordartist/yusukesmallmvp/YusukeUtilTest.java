package com.swordartist.yusukesmallmvp;

import com.swordartist.yusukesmallmvp.util.YusukeConvertUtil;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Yusuke Yanai on 2017-03-08.
 */

public class YusukeUtilTest {

//    @Mock
//    YusukeConvertUtil yusukeConvert;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testYuskeUnit() {
        YusukeConvertUtil yc = mock(YusukeConvertUtil.class);
        when(yc.convertString("HAHAHA")).thenReturn("MOCKMOCK");
    }
}
