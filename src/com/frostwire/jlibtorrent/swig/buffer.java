/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class buffer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected buffer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(buffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_buffer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class interval {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected interval(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(interval obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_buffer_interval(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public interval() {
      this(libtorrent_jni.new_buffer_interval__SWIG_0(), true);
    }
  
    public interval(String b, String e) {
      this(libtorrent_jni.new_buffer_interval__SWIG_1(b, e), true);
    }
  
    public char op_get_at(int index) {
      return libtorrent_jni.buffer_interval_op_get_at(swigCPtr, this, index);
    }
  
    public int left() {
      return libtorrent_jni.buffer_interval_left(swigCPtr, this);
    }
  
    public void setBegin(String value) {
      libtorrent_jni.buffer_interval_begin_set(swigCPtr, this, value);
    }
  
    public String getBegin() {
      return libtorrent_jni.buffer_interval_begin_get(swigCPtr, this);
    }
  
    public void setEnd(String value) {
      libtorrent_jni.buffer_interval_end_set(swigCPtr, this, value);
    }
  
    public String getEnd() {
      return libtorrent_jni.buffer_interval_end_get(swigCPtr, this);
    }
  
  }

  static public class const_interval {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected const_interval(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(const_interval obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libtorrent_jni.delete_buffer_const_interval(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public const_interval(buffer.interval i) {
      this(libtorrent_jni.new_buffer_const_interval__SWIG_0(buffer.interval.getCPtr(i), i), true);
    }
  
    public const_interval(String b, String e) {
      this(libtorrent_jni.new_buffer_const_interval__SWIG_1(b, e), true);
    }
  
    public char op_get_at(int index) {
      return libtorrent_jni.buffer_const_interval_op_get_at(swigCPtr, this, index);
    }
  
    public boolean op_eq(buffer.const_interval p_interval) {
      return libtorrent_jni.buffer_const_interval_op_eq(swigCPtr, this, buffer.const_interval.getCPtr(p_interval), p_interval);
    }
  
    public int left() {
      return libtorrent_jni.buffer_const_interval_left(swigCPtr, this);
    }
  
    public void setBegin(String value) {
      libtorrent_jni.buffer_const_interval_begin_set(swigCPtr, this, value);
    }
  
    public String getBegin() {
      return libtorrent_jni.buffer_const_interval_begin_get(swigCPtr, this);
    }
  
    public void setEnd(String value) {
      libtorrent_jni.buffer_const_interval_end_set(swigCPtr, this, value);
    }
  
    public String getEnd() {
      return libtorrent_jni.buffer_const_interval_end_get(swigCPtr, this);
    }
  
  }

  public buffer(long n) {
    this(libtorrent_jni.new_buffer__SWIG_0(n), true);
  }

  public buffer() {
    this(libtorrent_jni.new_buffer__SWIG_1(), true);
  }

  public buffer(buffer b) {
    this(libtorrent_jni.new_buffer__SWIG_2(buffer.getCPtr(b), b), true);
  }

  public buffer.interval data() {
    return new buffer.interval(libtorrent_jni.buffer_data__SWIG_0(swigCPtr, this), true);
  }

  public void resize(long n) {
    libtorrent_jni.buffer_resize(swigCPtr, this, n);
  }

  public void insert(String point, String first, String last) {
    libtorrent_jni.buffer_insert(swigCPtr, this, point, first, last);
  }

  public void erase(String b, String e) {
    libtorrent_jni.buffer_erase(swigCPtr, this, b, e);
  }

  public void clear() {
    libtorrent_jni.buffer_clear(swigCPtr, this);
  }

  public long size() {
    return libtorrent_jni.buffer_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.buffer_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.buffer_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.buffer_empty(swigCPtr, this);
  }

  public String begin() {
    return libtorrent_jni.buffer_begin__SWIG_0(swigCPtr, this);
  }

  public String end() {
    return libtorrent_jni.buffer_end__SWIG_0(swigCPtr, this);
  }

  public void swap(buffer b) {
    libtorrent_jni.buffer_swap(swigCPtr, this, buffer.getCPtr(b), b);
  }

}
