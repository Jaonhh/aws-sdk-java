/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTapeWithBarcodeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTapeWithBarcodeRequestMarshaller {

    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<Long> TAPESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeSizeInBytes").build();
    private static final MarshallingInfo<String> TAPEBARCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeBarcode").build();
    private static final MarshallingInfo<Boolean> KMSENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KMSEncrypted").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();

    private static final CreateTapeWithBarcodeRequestMarshaller instance = new CreateTapeWithBarcodeRequestMarshaller();

    public static CreateTapeWithBarcodeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTapeWithBarcodeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTapeWithBarcodeRequest.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(createTapeWithBarcodeRequest.getTapeSizeInBytes(), TAPESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(createTapeWithBarcodeRequest.getTapeBarcode(), TAPEBARCODE_BINDING);
            protocolMarshaller.marshall(createTapeWithBarcodeRequest.getKMSEncrypted(), KMSENCRYPTED_BINDING);
            protocolMarshaller.marshall(createTapeWithBarcodeRequest.getKMSKey(), KMSKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
