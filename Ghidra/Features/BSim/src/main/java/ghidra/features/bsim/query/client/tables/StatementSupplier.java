/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.features.bsim.query.client.tables;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * {@link StatementSupplier} provides a callback function to generate a {@link Statement}.
 *
 * @param <S> {@link Statement} implementation class
 */
public interface StatementSupplier<S extends Statement> {

	/**
	 * Return a {@link Statement} for use within the current thread.
	 * @return statement
	 * @throws SQLException if callback fails when producing the statement
	 */
	S get() throws SQLException;
}
