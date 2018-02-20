/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.giraph.block_app.library.gc;

import org.apache.giraph.block_app.framework.api.BlockWorkerContextSendApi;
import org.apache.giraph.block_app.framework.piece.PieceWithWorkerContext;
import org.apache.giraph.types.NoMessage;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

/**
 * Dummy piece to hint System.gc()
 */
public class WorkerGCPiece extends PieceWithWorkerContext<WritableComparable,
    Writable, Writable, NoMessage, Object, NoMessage, Object>  {

  @Override
  public void workerContextSend(
      BlockWorkerContextSendApi<WritableComparable, NoMessage> workerContextApi,
      Object executionStage,
      Object workerValue) {
    System.gc();
  }
}
