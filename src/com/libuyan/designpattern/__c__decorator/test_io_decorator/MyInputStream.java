package com.libuyan.designpattern.__c__decorator.test_io_decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author libuyan
 * @date 2021/5/7 21:47
 */
public class MyInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public MyInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read == -1 ? read : Character.toLowerCase(read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        if (read == -1) {
            return read;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return read;
    }
    @Override
    public void close() throws IOException {
        super.close();
    }


}
