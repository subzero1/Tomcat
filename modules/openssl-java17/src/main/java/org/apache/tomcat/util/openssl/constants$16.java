/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$16 {

    static final FunctionDescriptor SSL_CTX_set_cert_verify_callback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_set_cert_verify_callback$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_cert_verify_callback",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.SSL_CTX_set_cert_verify_callback$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_use_PrivateKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_use_PrivateKey$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_use_PrivateKey",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$16.SSL_CTX_use_PrivateKey$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_use_certificate$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_use_certificate$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_use_certificate",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$16.SSL_CTX_use_certificate$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_default_passwd_cb$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_set_default_passwd_cb$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_default_passwd_cb",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.SSL_CTX_set_default_passwd_cb$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_check_private_key$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_check_private_key$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_check_private_key",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$16.SSL_CTX_check_private_key$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_session_id_context$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SSL_CTX_set_session_id_context$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_session_id_context",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$16.SSL_CTX_set_session_id_context$FUNC, false
    );
}


