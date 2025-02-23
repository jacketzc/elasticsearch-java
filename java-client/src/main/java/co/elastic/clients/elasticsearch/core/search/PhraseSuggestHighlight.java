/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggestHighlight

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.PhraseSuggestHighlight">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhraseSuggestHighlight implements JsonpSerializable {
	private final String postTag;

	private final String preTag;

	// ---------------------------------------------------------------------------------------------

	private PhraseSuggestHighlight(Builder builder) {

		this.postTag = ApiTypeHelper.requireNonNull(builder.postTag, this, "postTag");
		this.preTag = ApiTypeHelper.requireNonNull(builder.preTag, this, "preTag");

	}

	public static PhraseSuggestHighlight of(Function<Builder, ObjectBuilder<PhraseSuggestHighlight>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Use in conjunction with <code>pre_tag</code> to define the HTML
	 * tags to use for the highlighted text.
	 * <p>
	 * API name: {@code post_tag}
	 */
	public final String postTag() {
		return this.postTag;
	}

	/**
	 * Required - Use in conjunction with <code>post_tag</code> to define the HTML
	 * tags to use for the highlighted text.
	 * <p>
	 * API name: {@code pre_tag}
	 */
	public final String preTag() {
		return this.preTag;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("post_tag");
		generator.write(this.postTag);

		generator.writeKey("pre_tag");
		generator.write(this.preTag);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestHighlight}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PhraseSuggestHighlight> {
		private String postTag;

		private String preTag;

		/**
		 * Required - Use in conjunction with <code>pre_tag</code> to define the HTML
		 * tags to use for the highlighted text.
		 * <p>
		 * API name: {@code post_tag}
		 */
		public final Builder postTag(String value) {
			this.postTag = value;
			return this;
		}

		/**
		 * Required - Use in conjunction with <code>post_tag</code> to define the HTML
		 * tags to use for the highlighted text.
		 * <p>
		 * API name: {@code pre_tag}
		 */
		public final Builder preTag(String value) {
			this.preTag = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggestHighlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestHighlight build() {
			_checkSingleUse();

			return new PhraseSuggestHighlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggestHighlight}
	 */
	public static final JsonpDeserializer<PhraseSuggestHighlight> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhraseSuggestHighlight::setupPhraseSuggestHighlightDeserializer);

	protected static void setupPhraseSuggestHighlightDeserializer(
			ObjectDeserializer<PhraseSuggestHighlight.Builder> op) {

		op.add(Builder::postTag, JsonpDeserializer.stringDeserializer(), "post_tag");
		op.add(Builder::preTag, JsonpDeserializer.stringDeserializer(), "pre_tag");

	}

}
