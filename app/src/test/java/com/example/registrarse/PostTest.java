package com.example.registrarse;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class PostTest {


    @Test
    public void testSendingPostreturnsPost(){
        String expected = "000001";
        NewPost postinterface = mock(NewPost.class);
        when(postinterface.getId()).thenReturn("000001");
        String post = postinterface.getId();
        Assert.assertEquals(expected,post);
    }

    @Test
    public void testSendingPostreturnsPostFalse(){
        PostClient postClient = new PostClient();
        PostClientInterface clientInterface = mock(PostClientInterface.class);
        when(clientInterface.sendId(Mockito.isA(NewPost.class))).thenReturn("Nuevo Id");
        String Newid = postClient.sendId(Mockito.isA(NewPost.class));
        Assert.assertEquals("No new ID",Newid);
    }
}
