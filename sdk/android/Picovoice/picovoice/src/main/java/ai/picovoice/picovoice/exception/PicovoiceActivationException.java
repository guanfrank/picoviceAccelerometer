/*
    Copyright 2021 Picovoice Inc.

    You may not use this file except in compliance with the license. A copy of the license is
    located in the "LICENSE" file accompanying this source.

    Unless required by applicable law or agreed to in writing, software distributed under the
    License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
    express or implied. See the License for the specific language governing permissions and
    limitations under the License.
*/

package ai.picovoice.picovoice;

public class PicovoiceActivationException extends PicovoiceException {
    PicovoiceActivationException(Throwable cause) {
        super(cause);
    }

    PicovoiceActivationException(String message) {
        super(message);
    }

    PicovoiceActivationException(String message, Throwable cause) {
        super(message, cause);
    }
}
